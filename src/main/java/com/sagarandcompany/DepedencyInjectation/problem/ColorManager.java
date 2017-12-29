package com.sagarandcompany.DepedencyInjectation.problem;

public class ColorManager {

    MyColor color = new RedColor();

    public void printColor() {
        color.printColor();
    }
}