package com.orion.user.service.controller.feign;

import com.orion.user.common.model.UserInfo;
import jdk.net.SocketFlow;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserConnectControllerTest {

    @Autowired
    private UserConnectController userConnectController;

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    public void getUserList() throws Exception {

//        String response = mockMvc.perform(MockMvcRequestBuilders.get("/feign/users"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.[*].userName").isNotEmpty())
//                .andReturn().getResponse().getContentAsString();
        List<UserInfo> userInfoList =  userConnectController.getUserList();
        log.info(" ** UserConnectControllerTest ** getUserList **  [{}] ", userConnectController.getUserList());
        Assert.assertNotNull(userInfoList);
    }
}