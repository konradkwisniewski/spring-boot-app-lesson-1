package com.appfactory.springlesson1.service.impl;


import com.appfactory.springlesson1.service.MathService;
import org.springframework.stereotype.Service;

@Service("mathServiceImpl")
public class MathServiceImpl implements MathService{

    @Override
    public Integer add(Integer skladnik1, Integer skladnik2) {
        return skladnik1 + skladnik2;
    }
}
