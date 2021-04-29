package com.example.demo.service.impl;

import com.example.demo.bean.AccType;
import com.example.demo.dao.AccTypeDao;
import com.example.demo.service.inte.AccTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccTypeServiceImp implements AccTypeService {

    @Autowired
    private AccTypeDao accTypeDao;

    @Override
    public AccType selectById(String code) {
        return accTypeDao.getOne(code);
    }

    @Override
    public List<AccType> findAll() {
        return accTypeDao.findAll();
    }
}
