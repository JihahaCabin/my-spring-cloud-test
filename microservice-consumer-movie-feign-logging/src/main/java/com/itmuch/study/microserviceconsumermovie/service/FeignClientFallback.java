package com.itmuch.study.microserviceconsumermovie.service;

import com.itmuch.study.microserviceconsumermovie.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FeignClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        user.setUsername("default");
        return user;

    }
}
