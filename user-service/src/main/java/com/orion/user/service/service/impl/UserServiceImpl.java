package com.orion.user.service.service.impl;

import com.orion.user.common.model.UserInfo;
import com.orion.user.service.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserInfo> getUsers() {

        List<UserInfo> userList = new ArrayList<>();
        UserInfo user1 = new UserInfo();
        user1.setPassword("ENC(zilong)");
        user1.setUserEmail("zilong@shu.com");
        user1.setUserId("yun.zhao");
        user1.setUserMobileNo("66660008");
        user1.setUserName("Zhao Yun");

        userList.add(user1);

        UserInfo user2 = new UserInfo();
        user2.setUserMobileNo("66660002");
        user2.setUserId("yu.guan");
        user2.setUserEmail("yunchang@shu.com");
        user2.setPassword("ENC(yunchang)");
        user2.setUserName("Guan Yu");

        userList.add(user2);

        return userList;
    }
}
