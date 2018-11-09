package com.brautomatic.service;

import com.brautomatic.model.Disk;
import com.brautomatic.model.Role;
import com.brautomatic.model.User;
import com.brautomatic.repository.DiskRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DiskServiceImplTest {

    @Autowired
    private DiskServiceImpl diskService;
    @MockBean
    private DiskRepository diskRepository;

    private Disk diskBean = new Disk();
    private User userBean = new User();
    private List<Disk> diskList = new ArrayList<>();

    @Before
    public void setUp() {
        userBean.setUserName("user");
        userBean.setPassword("pass");
        userBean.setRoles(Collections.singleton(Role.USER));
        diskBean.setUser(userBean);
        diskBean.setName("for new user");
        diskList.add(diskBean);
    }

    @Test
    public void getDiskById() {
        Mockito.when(diskRepository.findById(0L)).thenReturn(java.util.Optional.ofNullable(diskBean));
        Assert.assertTrue(diskService.getDiskById(0L).get().equals(diskBean));
        Mockito.verify(diskRepository, Mockito.times(1)).findById(0L);
    }

    @Test
    public void getAllFreeDiskList() {
        Mockito.when(diskRepository.getAlFreeDisks()).thenReturn(diskList);
        Assert.assertTrue(diskService.getAllFreeDiskList().contains(diskBean));
        Mockito.verify(diskRepository, Mockito.times(1)).getAlFreeDisks();
    }

    @Test
    public void getAllUserDiskByUser() {
        Mockito.when(diskRepository.findByUser(userBean)).thenReturn(diskList);
        Assert.assertTrue(diskService.getAllUserDiskByUser(userBean).contains(diskBean));
        Mockito.verify(diskRepository, Mockito.times(1)).findByUser(userBean);
    }

    @Test
    public void addDisk() {
        Mockito.when(diskRepository.save(diskBean)).thenReturn(diskBean);
        diskService.addDisk(diskBean);
        Mockito.verify(diskRepository, Mockito.times(1)).save(diskBean);
    }
}
