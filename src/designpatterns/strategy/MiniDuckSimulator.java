package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:21
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPower());
        model.performFly();
    }
}
