package com.geekster.URL_Hit_Counter.service;

import com.geekster.URL_Hit_Counter.model.User;
import com.geekster.URL_Hit_Counter.repo.UserHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    @Autowired
    UserHitRepo userHitRepo;

    public User getCount() {
        return userHitRepo.getHitCount();
    }

    public User getCountByUserName(String userName) {
        return userHitRepo.getHitCountByUserName(userName);
    }
}
