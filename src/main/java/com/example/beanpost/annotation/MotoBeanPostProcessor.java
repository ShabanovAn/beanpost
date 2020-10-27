package com.example.beanpost.annotation;

import com.example.beanpost.lissener.Lissener;
import com.example.beanpost.lissener.Moto;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

@Component
public class MotoBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().equals(Moto.class)) {
            System.out.println("postProcessBeforeInitialization  " + bean.getClass());
        }
      //  System.out.println("postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            Speedometer annotation = field.getAnnotation(Speedometer.class);
                if (annotation != null) {
                    System.out.println(beanName);
                    int minSpeed = annotation.min();
                    int maxSpeed = annotation.max();
                    Random random = new Random();
                    int speed = minSpeed + random.nextInt(maxSpeed - minSpeed);
                    field.setAccessible(true);
                    ReflectionUtils.setField(field, bean, speed);
                }
        }
       // System.out.println("postProcessAfterInitialization" + beanName + " " + bean);
        return bean;
    }
}
