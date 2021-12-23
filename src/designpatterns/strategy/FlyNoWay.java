package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:07
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //
        System.out.println("I can't fly");
    }
}
