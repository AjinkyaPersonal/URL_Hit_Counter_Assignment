package com.geekster.URL_Hit_Counter.controller;

import com.geekster.URL_Hit_Counter.model.User;
import com.geekster.URL_Hit_Counter.repo.UserHitRepo;
import com.geekster.URL_Hit_Counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    UrlHitService urlHitService;

    @GetMapping(value = "count")
    public User getHitCount() {
        return urlHitService.getCount();
    }

    @GetMapping(value = "username/{userName}/count")
    public User getHitUrlCountByUserName(@PathVariable String userName){
        return urlHitService.getCountByUserName(userName);
    }
}
