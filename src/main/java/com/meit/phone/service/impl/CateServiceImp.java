package com.meit.phone.service.impl;

import com.meit.phone.bean.Cate;
import com.meit.phone.dao.CateDao;
import com.meit.phone.service.inte.CateServiceInte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateServiceImp implements CateServiceInte {

    @Autowired
    private CateDao cateDao;

    @Override
    public Cate selectById(Integer cityid) {
        return cateDao.getOne(cityid);
    }

    @Override
    public List<Cate> findAll() {
        return cateDao.findAll();
    }
}
