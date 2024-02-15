package org.example.designpatterns.factorypattern;

public class CalPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if(pizzaType.equalsIgnoreCase("cheese")){
            pizza = new CalCheesePizza();
        } else if (pizzaType.equalsIgnoreCase("veg")) {
            pizza = new CalVegPizza();
        }else if(pizzaType.equalsIgnoreCase("chicken")){
            pizza  = new CalChickenPizza();
        }
        return pizza;
    }
}
