package com.sagarandcompany.DepedencyInjectation;

import com.sagarandcompany.DepedencyInjectation.solution.ColorManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DepedencyInjectationApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DepedencyInjectationApplication.class, args);
//        ColorManager colorManager = new ColorManager();
//        colorManager.printColor();
//
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ColorManager colorManager = (ColorManager) context.getBean("colorManager");
        colorManager.printColor();

    }
}
