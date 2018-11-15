package com.orion.user.service.controller.web;

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
@RequestMapping("/web")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    @JsonView(UserInfo.UserSimpleView.class)
    public List<UserInfo> getUserList(){
        log.info("****************** Web Service involved ******************");
        return userService.getUsers();
    }
}
