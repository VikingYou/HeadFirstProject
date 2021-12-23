package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:08
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("gua gua");
    }
}
