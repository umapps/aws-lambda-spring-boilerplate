package com.umapps.aws.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umapps.aws.data.User;

@RestController
public class ProfileController {

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUser() throws InterruptedException {
        Thread.sleep(1500);
        return List.of(new User("shri", "ram", "shri.ram@umapps.com"), new User("shri", "krishna", "shri.krishna@umapps.com"));
    }

}
