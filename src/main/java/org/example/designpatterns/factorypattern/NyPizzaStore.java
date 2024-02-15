package org.example.designpatterns.factorypattern;

public class NyPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if(pizzaType.equalsIgnoreCase("cheese")){
            pizza = new NYCheesePizza();
        } else if (pizzaType.equalsIgnoreCase("veg")) {
            pizza = new NYVegPizza();
        }else if(pizzaType.equalsIgnoreCase("chicken")){
            pizza  = new NYChickenPizza();
        }
        return pizza;
    }
}
