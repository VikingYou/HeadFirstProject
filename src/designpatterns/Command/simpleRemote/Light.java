package designpatterns.Command.simpleRemote;

/**
 * @author ycd20
 * @date 2021/12/27
 * @time 21:43
 */
public class Light {
    public Light() {
    }

    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}
