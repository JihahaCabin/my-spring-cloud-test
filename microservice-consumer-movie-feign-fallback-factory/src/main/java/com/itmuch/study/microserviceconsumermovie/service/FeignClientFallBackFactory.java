package com.itmuch.study.microserviceconsumermovie.service;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FeignClientFallBackFactory implements FallbackFactory<UserFeignClient> {

    private final FeignClientFallback feignClientFallback;

    public FeignClientFallBackFactory(FeignClientFallback feignClientFallback){
        this.feignClientFallback = feignClientFallback;
    }

    @Override
    public UserFeignClient create(Throwable throwable) {
        log.error(throwable.getMessage());
        return feignClientFallback;
    }
}
