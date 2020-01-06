package com.nanrui.dataworks.dataapi.service;

import com.nanrui.dataworks.dataapi.dao.TestJpaRepository;
import com.nanrui.dataworks.dataapi.entity.TestJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestJpaService {

    @Autowired
    TestJpaRepository testJpaRepository;

    public List<TestJpa> getJpa(){
        List<TestJpa> all = testJpaRepository.findAll();
        return all;
    }

}
