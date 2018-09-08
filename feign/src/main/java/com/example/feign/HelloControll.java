package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/4.
 */
@RestController
public class HelloControll {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    SchedualServiceHi1 schedualServiceHi1;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHi(name);
    }
    @GetMapping(value = "/hi1")
    public String sayHi1(@RequestParam String name){
        return schedualServiceHi1.sayHi(name);
    }
}
