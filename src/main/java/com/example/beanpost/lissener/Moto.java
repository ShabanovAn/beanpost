package com.example.beanpost.lissener;

import com.example.beanpost.annotation.Speedometer;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Moto {

    private Long id;

    private String name;
    @Getter
    @Speedometer(min = 10, max = 180)
    private int speed;
}
