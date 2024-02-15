package org.example.designpatterns.decoratorpattern;

public class ExtraShotsDecorator implements CoffeeDecorator{
    private Coffee coffee;

    ExtraShotsDecorator(Coffee coffee){
        this.coffee = coffee;
    }


    @Override
    public double calculateCost() {
        return coffee.calculateCost()+1.25;
    }
}
