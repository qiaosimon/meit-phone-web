package com.meit.phone.dao;

import com.meit.phone.bean.Cate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CateDao extends JpaRepository<Cate, Integer> {

    @Override
    List<Cate> findAll();

    @Override
    Cate getOne(Integer s);

    @Override
    <S extends Cate> S save(S s);


}
