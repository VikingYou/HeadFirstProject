package designpatterns.decrator.starbuzz;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:18
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
