package com.meit.phone.service.inte;

import com.meit.phone.bean.Cate;

import java.util.List;

public interface CateServiceInte {
    public Cate selectById(Integer cateid);
    public List<Cate> findAll();
}
