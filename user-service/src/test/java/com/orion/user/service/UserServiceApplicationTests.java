package com.orion.user.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void applicationStarts() {
        UserServiceApplication.main(new String[]{});
    }


    @Test
    public void applicationStartsWeb() {
        UserServiceApplication bootuApp = new UserServiceApplication();
        Class<UserServiceApplication> cBoot = UserServiceApplication.class;
        try {
            Method method = cBoot.getDeclaredMethod("configure", new Class[]{SpringApplicationBuilder.class});
            method.setAccessible(true);
            method.invoke(bootuApp, new Object[]{new SpringApplicationBuilder()});
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
