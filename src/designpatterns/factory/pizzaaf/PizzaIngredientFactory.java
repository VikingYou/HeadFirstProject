package designpatterns.factory.pizzaaf;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 20:01
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
