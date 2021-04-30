package com.meit.phone.dao;

import com.meit.phone.bean.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ShopDao extends JpaRepository<Shop,String> {

    @Override
    List<Shop> findAll();

    @Override
    Shop getOne(String s);

    @Override
    <S extends Shop> S save(S s);


}
