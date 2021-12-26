package designpatterns.decrator.starbuzz;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:16
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    public double cost() {
        return 1.05;
    }
}
