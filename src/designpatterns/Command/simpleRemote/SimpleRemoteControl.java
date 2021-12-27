package designpatterns.Command.simpleRemote;

/**
 * @author ycd20
 * @date 2021/12/27
 * @time 21:41
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
