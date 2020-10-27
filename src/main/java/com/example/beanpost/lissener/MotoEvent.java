package com.example.beanpost.lissener;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class MotoEvent extends ApplicationEvent {

    @Getter
    private int speed;

    public MotoEvent(Object source, int speed) {
        super(source);
        this.speed = speed;
    }
}
