package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/9/4.
 */
@FeignClient(value = "service1")
public interface SchedualServiceHi1 {

    @RequestMapping(value = "/hi1",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
