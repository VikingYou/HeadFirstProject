package designpatterns.decrator.starbuzzsize;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:12
 */
public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription();
}
