package com.mkyong.core.services;

import com.mkyong.core.repository.HelloRepository;
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

    @Override
    public String get1() {
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
