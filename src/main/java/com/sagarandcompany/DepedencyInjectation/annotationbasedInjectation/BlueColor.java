package com.sagarandcompany.DepedencyInjectation.annotationbasedInjectation;

public class BlueColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}