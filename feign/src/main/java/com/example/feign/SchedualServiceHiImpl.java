package com.example.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/9/5.
 */
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayHi(@RequestParam(value = "name") String name) {
        return "sorry"+name;
    }
}
