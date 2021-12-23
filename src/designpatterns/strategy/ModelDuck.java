package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:24
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
