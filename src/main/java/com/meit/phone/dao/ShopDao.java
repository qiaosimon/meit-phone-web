package com.meit.phone.dao;

import com.meit.phone.bean.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ShopDao extends JpaRepository<Shop,Integer> {

    @Override
    List<Shop> findAll();

    @Override
    Shop getOne(Integer i);

    @Override
    <S extends Shop> S save(S s);

    List<Shop> findByCityidAndCateid(int cityid,int cateid);
}
