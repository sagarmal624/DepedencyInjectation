package com.sagarandcompany.DepedencyInjectation.wiringBased;

public class RedColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is red in color...");
    }
}