package com.example.beanpost.lissener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class Lissener implements ApplicationListener<MotoEvent> {
    @Override
    public void onApplicationEvent(MotoEvent moto) {
        System.out.println(moto.getSpeed() + " MotoSpeed");
        
    }
}
