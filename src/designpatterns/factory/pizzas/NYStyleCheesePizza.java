package designpatterns.factory.pizzas;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 19:31
 */
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Granted Reggiano Cheese");
    }
}
