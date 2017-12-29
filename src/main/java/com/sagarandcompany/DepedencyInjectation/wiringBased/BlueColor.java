package com.sagarandcompany.DepedencyInjectation.wiringBased;

public class BlueColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}