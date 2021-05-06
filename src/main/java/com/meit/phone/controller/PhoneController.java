package com.meit.phone.controller;

import com.meit.phone.service.inte.CateServiceInte;
import com.meit.phone.service.inte.CityServiceInte;
import com.meit.phone.service.inte.ShopServiceInte;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RefreshScope
@Aspect
public class PhoneController {

    @Autowired
    private ShopServiceInte shopService;
    @Autowired
    private CateServiceInte cateService;
    @Autowired
    private CityServiceInte cityService;

    @PostMapping("/getCateAll")
    public List<?> getCateAll() {
        List<?> list = cateService.findAll();
        System.out.println(list.toArray());
        return list;
    }

    @PostMapping("/getCityAll")
    public List<?> getCityAll(@RequestParam("username") int state) {
        List<?> list = cityService.findAll();
        return list;
    }

    @PostMapping("/getCityBySate")
    public List<?> getCityBySate(@RequestParam("state") int state) {
        List<?> list = cityService.findBySate(state);
        return list;
    }

    @PostMapping("/getShopAll")
    public List<?> getShopAll() {
        List<?> list = shopService.findAll();
        return list;
    }

    @PostMapping("/getShopByCityidAndCateid")
    public List<?> getShopByCityidAndCateid(@RequestParam("cityid") int cityid, @RequestParam("cateid") int cateid) {
        List<?> list = shopService.findByCityidAndCateid(cityid,cateid);
        return list;
    }
}
