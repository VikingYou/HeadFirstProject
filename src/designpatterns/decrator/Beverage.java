package designpatterns.decrator;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:10
 */
public abstract class Beverage {
    String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
