package designpatterns.decrator.starbuzzsize;

/**
 * @author ycd20
 * @date 2021/12/24
 * @time 8:10
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;
    String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }
}
