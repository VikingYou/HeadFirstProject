package designpatterns.factory.pizzas;

import designpatterns.decrator.starbuzzsize.SimplePizzaFactory;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 19:01
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
