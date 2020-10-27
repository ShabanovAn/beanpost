package com.example.beanpost.controller;

import com.example.beanpost.lissener.Moto;
import com.example.beanpost.lissener.MotoEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/moto")
public class MotoController {

    private Moto moto;

    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping
    public Moto getAllMoto() {
        applicationEventPublisher.publishEvent(new MotoEvent(this, moto.getSpeed()));
        return moto;
    }


}
