package designpatterns.factory.pizzas;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 19:37
 */
public class PepperoniPizza extends Pizza{
    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Granted parmesan cheese");
    }
}
