package com.itmuch.study.microserviceconsumermovie.service;

import com.itmuch.study.microserviceconsumermovie.config.FeignLogConfiguration;
import com.itmuch.study.microserviceconsumermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user",configuration = FeignLogConfiguration.class,
fallbackFactory = FeignClientFallBackFactory.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User findById(@PathVariable Long id);
}
