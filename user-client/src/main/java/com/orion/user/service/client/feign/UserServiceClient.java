package com.orion.user.service.client.feign;

import com.fasterxml.jackson.annotation.JsonView;
import com.orion.user.common.model.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="BOOTU-USER")
public interface UserServiceClient {

    @GetMapping("/feign/users")
    @JsonView(UserInfo.UserDetailView.class)
    public List<UserInfo> getUserList();
}
