package designpatterns.decrator.starbuzzsize;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 14:39
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",whip";
    }
}
