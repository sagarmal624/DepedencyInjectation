package com.sagarandcompany.DepedencyInjectation.wiringBased;

import org.springframework.beans.factory.annotation.Autowired;

public class ColorManager {
    MyColor color;

    @Autowired
    public void setColor(RedColor color) {
        this.color = color;
    }

    public void printColor() {
        color.printColor();
    }
}