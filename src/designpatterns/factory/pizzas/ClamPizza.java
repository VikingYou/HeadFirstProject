package designpatterns.factory.pizzas;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 19:38
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = " Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Granted parmesan cheese");
    }
}
