package com.brautomatic.service;

import com.brautomatic.model.Role;
import com.brautomatic.model.User;
import com.brautomatic.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;
    @MockBean
    private UserRepository userRepository;

    private User userBean = new User();

    @Before
    public void setUp() {
        userBean.setUserName("user");
        userBean.setPassword("pass");
        userBean.setRoles(Collections.singleton(Role.USER));
    }

    @Test
    public void addUser() {
        Mockito.when(userRepository.save(userBean)).thenReturn(userBean);
        userService.addUser(userBean);

        Mockito.verify(userRepository, Mockito.times(1)).save(userBean);
    }

    @Test
    public void loadUserByUsername() {
        Mockito.when(userRepository.findUserByUserName("user")).thenReturn(userBean);

        User currentUser = (User) userService.loadUserByUsername("user");
        Mockito.verify(userRepository, Mockito.times(1)).findUserByUserName("user");

        Assert.assertTrue(currentUser.getUsername().equals("user"));
        Assert.assertTrue(currentUser.getPassword().equals("pass"));

    }
}
