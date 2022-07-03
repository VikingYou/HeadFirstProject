package example.prototype.shapes;

/**
 * Created by ycd20 on 2022/07/03
 */
public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle) || !super.equals(obj)) return false;
        Circle shape2 = (Circle) obj;
        return shape2.radius == radius;
    }
}
