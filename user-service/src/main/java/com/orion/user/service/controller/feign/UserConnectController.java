package com.orion.user.service.controller.feign;

import com.fasterxml.jackson.annotation.JsonView;
import com.orion.user.common.model.UserInfo;
import com.orion.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
@Slf4j
public class UserConnectController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    @JsonView(UserInfo.UserDetailView.class)
    public List<UserInfo> getUserList(){
        log.info("****************** Feign Service involved ******************");
        return userService.getUsers();
    }
}
