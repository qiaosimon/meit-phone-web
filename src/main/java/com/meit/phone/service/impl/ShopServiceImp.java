package com.meit.phone.service.impl;

import com.meit.phone.bean.Shop;
import com.meit.phone.dao.ShopDao;
import com.meit.phone.service.inte.ShopServiceInte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImp implements ShopServiceInte {

    @Autowired
    private ShopDao shopDao;

    @Override
    public Shop selectById(Integer id) {
        return shopDao.getOne(id);
    }

    @Override
    public List<Shop> findAll() {
        return shopDao.findAll();
    }

    @Override
    public List<Shop> findByCityidAndCateid(int cityid, int cateid) {
        return shopDao.findByCityidAndCateid(cityid,cateid);
    }
}
