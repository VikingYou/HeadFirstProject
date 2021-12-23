package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:13
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
