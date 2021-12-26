package designpatterns.decrator.starbuzzsize;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:15
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
