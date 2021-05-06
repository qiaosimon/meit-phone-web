package com.meit.phone.service.inte;

import com.meit.phone.bean.City;

import java.util.List;

public interface CityServiceInte {
    public City selectById(Integer cityid);
    public List<City> findAll();
    public List<City> findBySate(int state);
}
