package designpatterns.decrator.starbuzz;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 14:36
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }
}
