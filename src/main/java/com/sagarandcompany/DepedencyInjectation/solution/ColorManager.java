package com.sagarandcompany.DepedencyInjectation.solution;

public class ColorManager {

    MyColor color;


    public void setColor(MyColor color) {
        this.color = color;
    }

    public void printColor() {
        color.printColor();
    }
}