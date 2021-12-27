package designpatterns.Command.simpleRemote;

/**
 * @author ycd20
 * @date 2021/12/27
 * @time 21:39
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
