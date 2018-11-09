package com.brautomatic.service;

import com.brautomatic.model.Disk;
import com.brautomatic.model.Role;
import com.brautomatic.model.TakenItem;
import com.brautomatic.model.User;
import com.brautomatic.repository.TakenItemRepository;
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
public class TakenItemServiceImplTest {

    @Autowired
    private TakenItemServiceImpl takenItemService;
    @MockBean
    private TakenItemRepository takenItemRepository;

    private User userBean = new User();
    private Disk diskBean = new Disk();
    private TakenItem takenItemBean = new TakenItem();
    private List<TakenItem> takenItemList = new ArrayList();

    @Before
    public void setUp() {
        userBean.setUserName("user");
        userBean.setPassword("pass");
        userBean.setRoles(Collections.singleton(Role.USER));
        diskBean.setUser(userBean);
        diskBean.setName("for new user");
        takenItemBean.setUser(userBean);
        takenItemBean.setDisk(diskBean);
    }

    @Test
    public void getAllTakenItem() {
        takenItemList.add(takenItemBean);
        Mockito.when(takenItemRepository.findAll()).thenReturn(takenItemList);

        Assert.assertTrue(takenItemService.getAllTakenItem().contains(takenItemBean));
        Mockito.verify(takenItemRepository, Mockito.times(1)).findAll();
    }

    @Test
    public void getMyTakenItem() {
        takenItemList.add(takenItemBean);
        Mockito.when(takenItemRepository.findByUser(userBean)).thenReturn(takenItemList);

        Assert.assertTrue(takenItemService.getMyTakenItem(userBean).contains(takenItemBean));
        Mockito.verify(takenItemRepository, Mockito.times(1)).findByUser(userBean);
    }

    @Test
    public void getMyGivenItem() {
        takenItemList.add(takenItemBean);
        Mockito.when(takenItemRepository.findGivenDiskList(userBean)).thenReturn(takenItemList);

        Assert.assertTrue(takenItemService.getMyGivenItem(userBean).contains(takenItemBean));
        Mockito.verify(takenItemRepository, Mockito.times(1)).findGivenDiskList(userBean);
    }

    @Test
    public void addTakenItem() {
        Mockito.when(takenItemRepository.save(takenItemBean)).thenReturn(takenItemBean);
        takenItemService.addTakenItem(takenItemBean);

        Mockito.verify(takenItemRepository, Mockito.times(1)).save(takenItemBean);
    }

    @Test
    public void deleteTakenItem() {
        takenItemService.addTakenItem(takenItemBean);
        takenItemService.deleteTakenItem(0L);

        Mockito.verify(takenItemRepository, Mockito.times(1)).deleteById(0L);
        Assert.assertTrue(takenItemService.getAllTakenItem().size() == 0);
    }
}
