package com.meit.phone.dao;

import com.meit.phone.bean.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CityDao extends JpaRepository<City,Integer> {

    @Override
    List<City> findAll();

    @Override
    City getOne(Integer s);

    @Override
    <S extends City> S save(S s);

    List<City> findByState(int state);
}
