package org.example.designpatterns.decoratorpattern;

public class Order {

    public  static void main(String[] args){
        Coffee coffee = new PlainCoffee();

        Coffee coffeeWith1Shots = new ExtraShotsDecorator(coffee);
        Coffee coffeeWith1MoreShot = new ExtraShotsDecorator(coffeeWith1Shots);
        System.out.println("Your Order Cost : $"+coffeeWith1MoreShot.calculateCost() );

    }
}
