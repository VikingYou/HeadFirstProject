package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:25
 */
public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
