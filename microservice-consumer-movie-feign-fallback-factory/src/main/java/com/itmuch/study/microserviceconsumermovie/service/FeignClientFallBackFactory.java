package com.itmuch.study.microserviceconsumermovie.service;

import feign.hystrix.FallbackFactory;

public class FeignCliengFallBackFactory implements FallbackFactory<UserFeignClient> {
}
