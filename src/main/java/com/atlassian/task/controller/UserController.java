package com.atlassian.task.controller;

import com.atlassian.task.client.JiraClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final JiraClient jiraClient;

    public UserController(JiraClient jiraClient) {
        this.jiraClient = jiraClient;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    String getUser(@RequestParam("username") String username) {
        return jiraClient.getUser(username);
    }

}
