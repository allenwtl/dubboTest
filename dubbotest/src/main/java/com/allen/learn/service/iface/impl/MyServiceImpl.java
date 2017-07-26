package com.allen.learn.service.iface.impl;


import com.allen.learn.service.iface.MyService;
import org.springframework.stereotype.Service;

@Service("myServiceImpl")
public class MyServiceImpl implements MyService{


    @Override
    public String doTest(String f1, String f2) {
        return f1 + f2;
    }
}
