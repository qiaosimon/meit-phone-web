package com.example.demo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.demo.service.inte.AccTypeService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;


@RestController
@RefreshScope
@SentinelResource
@Aspect
public class HelloController {

     @Autowired
    private AccTypeService accTypeService;

   volatile   String s = "a";
    @RequestMapping( "/hello")
    public String hello() {
        System.out.println("121222");

        List<String> names = Arrays.asList(" 张三 ", " 李四 ", " 王老五 ", " 李三 ", " 刘老四 ");
        String maxLenStartWithZ = names.stream()
                .parallel()
                .filter(name -> name.startsWith(" 张 "))
                .mapToInt(String::length)
                .max()
                .toString();
        System.out.println(maxLenStartWithZ);


        return "Hello Simon 123";
    }

    @Value("${useLocalCache:null}")
    private String useLocalCache;

    @GetMapping("/get")
    public String get() {
        System.out.println(useLocalCache);
        accTypeService.findAll();

        return useLocalCache;
    }

    @GetMapping("/getAll")
    public List<?> getAll() {
        return accTypeService.findAll();
    }
}
