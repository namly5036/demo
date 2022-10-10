package com.kevin.mockito.demo.services;

import com.kevin.mockito.demo.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    HelloRepository helloRepository;

    @Override
    public String get() {
        String a = "Kevin";
        int s = 0;
        if (a != null) {
            s = -1;
        } else {
            s = 1;
        }
        return helloRepository.get();
    }

}
