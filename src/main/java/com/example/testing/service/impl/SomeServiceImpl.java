package com.example.testing.service.impl;

import com.example.testing.service.SomeService;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {

    public void someMethod(){
        System.out.println("Some method call");
    }

}
