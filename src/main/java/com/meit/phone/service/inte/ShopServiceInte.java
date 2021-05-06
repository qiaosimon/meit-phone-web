package com.meit.phone.service.inte;

import com.meit.phone.bean.Shop;

import java.util.List;

public interface ShopServiceInte {
    public Shop selectById(Integer id);
    public List<Shop> findAll();
    public List<Shop> findByCityidAndCateid(int cityid,int cateid);
}
