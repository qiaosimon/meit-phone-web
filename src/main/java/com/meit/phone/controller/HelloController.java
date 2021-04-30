package com.meit.phone.controller;

import com.meit.phone.service.inte.ShopServiceInte;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RefreshScope
@Aspect
public class HelloController {

    @Autowired
    private ShopServiceInte shopService;

    @GetMapping("/get")
    public String get() {

        return null;
    }

    @PostMapping("/getAll")
    public List<?> getAll() {
        List<?> list = shopService.findAll();
        System.out.println(list.toArray());
        return list;
    }
}
