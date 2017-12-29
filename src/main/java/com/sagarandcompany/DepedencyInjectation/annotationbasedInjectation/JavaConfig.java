package com.sagarandcompany.DepedencyInjectation.annotationbasedInjectation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.sagarandcompany.DepedencyInjectation.annotationbasedInjectation"})
public class JavaConfig {
    @Bean("colorManager")
    public ColorManager getColorManager() {
        ColorManager colorManager = new ColorManager();
        colorManager.setColor(getRedColor());
        return colorManager;
    }

    @Bean
    public RedColor getRedColor() {
        RedColor redColor = new RedColor();
        return redColor;
    }

    @Bean
    public BlueColor getBlueColor() {
        BlueColor blueColor = new BlueColor();
        return blueColor;
    }
}
