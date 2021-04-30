package com.meit.phone.service.inte;

import com.meit.phone.bean.Shop;

import java.util.List;

public interface ShopServiceInte {
    public Shop selectById(String code);
    public List<Shop> findAll();
}
