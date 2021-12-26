package designpatterns.factory.pizzas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 19:06
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:  ");
        for (String topping : toppings) {
            System.out.println("     " + topping);
        }
    }

    void bake() {
        System.out.println("Bark for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Pizza pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
