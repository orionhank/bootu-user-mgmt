package com.orion.user.common.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class UserInfo {
    @JsonView(UserSimpleView.class)
    private String userId;
    @JsonView(UserSimpleView.class)
    private String userName;
    @JsonView(UserDetailView.class)
    private String password;
    @JsonView(UserDetailView.class)
    private String userEmail;
    @JsonView(UserDetailView.class)
    private String userMobileNo;

    public interface UserSimpleView {}

    public interface UserDetailView extends UserSimpleView {}
}
