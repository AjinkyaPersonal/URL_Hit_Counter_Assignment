package com.geekster.URL_Hit_Counter.repo;

import com.geekster.URL_Hit_Counter.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository

public class UserHitRepo {
    HashMap<String , User> hm = new HashMap<>();


    public User getHitCount() {
        if(!hm.containsKey("visitor")){
            User oneUser = new User("visitor" , 1);
            hm.put("visitor" , oneUser);

        }else{
            User oneUser = hm.get("visitor");
            int count = oneUser.getUrlHitCount();
            oneUser.setUrlHitCount(count+1);
//            hm.put("visitor" , oneUser);
        }

        return hm.get("visitor");
    }

    public User getHitCountByUserName(String userName) {
        if(!hm.containsKey(userName)){
            User userByUserName = new User(userName , 1);
            hm.put(userName , userByUserName);

        }else{
            User userByUserName = hm.get(userName);
            int count = userByUserName.getUrlHitCount();
            userByUserName.setUrlHitCount(count+1);
//            hm.put(userName , userByUserName);
        }
        return hm.get(userName);

    }
}
