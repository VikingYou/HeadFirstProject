package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:06
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
