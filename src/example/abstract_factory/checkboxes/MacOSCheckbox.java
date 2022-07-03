package example.abstract_factory.checkboxes;

/**
 * Created by ycd20 on 2022/07/03
 */
public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox");
    }
}
