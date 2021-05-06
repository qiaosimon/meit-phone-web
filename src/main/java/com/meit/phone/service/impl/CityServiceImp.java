package com.meit.phone.service.impl;

import com.meit.phone.bean.City;
import com.meit.phone.dao.CityDao;
import com.meit.phone.service.inte.CityServiceInte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImp implements CityServiceInte {

    @Autowired
    private CityDao cityDao;

    @Override
    public City selectById(Integer cityid) {
        return cityDao.getOne(cityid);
    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public List<City> findBySate(int state) {
        return cityDao.findByState(state);
    }
}
