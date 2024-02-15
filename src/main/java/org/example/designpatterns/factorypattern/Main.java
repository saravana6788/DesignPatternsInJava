package org.example.designpatterns.factorypattern;

public class Main {

    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore ps = new CalPizzaStore();
        ps.orderPizza("chicken");
    }
}
