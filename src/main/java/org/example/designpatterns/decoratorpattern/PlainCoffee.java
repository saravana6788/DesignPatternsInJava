package org.example.designpatterns.decoratorpattern;

public class PlainCoffee implements Coffee{

    @Override
    public double calculateCost() {
        return 3.25;
    }
}
