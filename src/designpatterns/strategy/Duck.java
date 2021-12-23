package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 19:51
 */
public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All Ducks float,even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
