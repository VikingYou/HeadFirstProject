package designpatterns.strategy;

/**
 * @author ycd20
 * @date 2021/12/23
 * @time 20:10
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
