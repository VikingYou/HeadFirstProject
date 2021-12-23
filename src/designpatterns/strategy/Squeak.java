package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:09
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("zhi zhi");
    }
}
