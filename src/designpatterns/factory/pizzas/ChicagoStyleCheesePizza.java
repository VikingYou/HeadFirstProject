package designpatterns.factory.pizzas;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 19:33
 */
public class ChicagoStyleCheesePizza extends Pizza{
   public ChicagoStyleCheesePizza(){
       name = "Chicago Style Deep Dish Cheese Pizza";
       dough = "Extra Thick Crust Dough";
       sauce = "Plum Tomato Sauce";

       toppings.add("Shredded Mozzarella Cheese");
   }
   void cut(){
       System.out.println("Cutting the pizza into square slices");
   }
}
