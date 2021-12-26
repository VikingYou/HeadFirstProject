package designpatterns.decrator.starbuzzsize;

/**
 * 让espresso 扩展自Beverage 类，因为espresso是一种饮料
 * @author ycd20
 * @date 2021/12/26
 * @time 14:31
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
