package com.example.demo.dao;

import com.example.demo.bean.AccType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AccTypeDao extends JpaRepository<AccType,String> {

    @Override
    List<AccType> findAll();

    @Override
    AccType getOne(String s);

    @Override
    <S extends AccType> S save(S s);
}
