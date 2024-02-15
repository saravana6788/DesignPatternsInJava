package org.example.designpatterns.decoratorpattern;

public class ExtraSugarDecorator implements CoffeeDecorator {
     private Coffee coffee;

     ExtraSugarDecorator(Coffee coffee){
         this.coffee = coffee;
     }

    @Override
    public double calculateCost() {
        return coffee.calculateCost()+0.99;
    }
}
