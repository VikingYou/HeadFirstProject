package designpatterns.decrator;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:13
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Expresso";
    }

    public double cost() {
        return 1.99;
    }
}
