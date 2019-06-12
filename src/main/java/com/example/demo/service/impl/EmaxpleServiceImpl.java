package com.example.demo.service.impl;

import com.example.Person;
import com.example.demo.mapper.ExampleMapper;
import com.example.demo.service.EmaxpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmaxpleServiceImpl implements EmaxpleService {
    @Autowired
    private ExampleMapper exampleMapper;
    @Override
    public void insertPerson(Person person) {
        exampleMapper.insertPerson(person);
    }

    @Override
    public String selectName() {
        return   exampleMapper.selectName();
    }
}
