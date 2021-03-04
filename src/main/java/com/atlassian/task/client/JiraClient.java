package com.atlassian.task.client;

import com.atlassian.task.config.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.MediaType;

@FeignClient(name = "JiraClient", url = "http://localhost:2990", configuration = FeignClientConfiguration.class)
public interface JiraClient {
    @GetMapping(value = "/jira/rest/myrestresource/1.0/user", consumes = MediaType.APPLICATION_JSON_VALUE)
    String getUser(@RequestParam("username") String username);
}
