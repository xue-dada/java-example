package com.example.javaexample.service;


import com.example.javaexample.entity.Test;
import com.example.javaexample.mapper.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDao dao;

    public String getStr() {
        Test test = dao.selectByPrimaryKey(1);
        System.out.println(test);
        return test.toString();
    }
}
