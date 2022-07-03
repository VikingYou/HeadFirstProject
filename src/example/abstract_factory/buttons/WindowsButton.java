package example.abstract_factory.buttons;

/**
 * Created by ycd20 on 2022/07/03
 */
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
