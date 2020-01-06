package com.nanrui.dataworks.dataapi.controller;

import com.nanrui.dataworks.dataapi.entity.TestJpa;
import com.nanrui.dataworks.dataapi.service.TestJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestJpaController {
    @Autowired
    TestJpaService testJpaService;

    @ResponseBody
    @GetMapping(value = "/getJpa")
    public List<TestJpa> sourceDataView_dashBoard(){
        List<TestJpa> jpaJavaBeanList = testJpaService.getJpa();
        return jpaJavaBeanList;
    }

}
