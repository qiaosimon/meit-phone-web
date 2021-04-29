package com.example.demo.service.inte;

import com.example.demo.bean.AccType;

import java.util.List;

public interface AccTypeService {
    public AccType selectById(String code);
    public List<AccType> findAll();
}
