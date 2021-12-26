package designpatterns.decrator.starbuzz;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:14
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
