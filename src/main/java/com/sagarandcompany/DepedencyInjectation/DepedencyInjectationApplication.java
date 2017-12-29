package com.sagarandcompany.DepedencyInjectation;

//import com.sagarandcompany.DepedencyInjectation.solution.ColorManager;

//import com.sagarandcompany.DepedencyInjectation.annotationbasedInjectation.ColorManager;

import com.sagarandcompany.DepedencyInjectation.wiringBased.ColorManager;
import com.sagarandcompany.DepedencyInjectation.wiringBased.JavaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DepedencyInjectationApplication {

    public static void main(String[] args) {
        //        ColorManager colorManager = new ColorManager();
//        colorManager.printColor();
//

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        ColorManager colorManager = (ColorManager) context.getBean("colorManager");
//        colorManager.printColor();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ColorManager colorManager = (ColorManager) context.getBean("colorManager");
        colorManager.printColor();


    }
}
