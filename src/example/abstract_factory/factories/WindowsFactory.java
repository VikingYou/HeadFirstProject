package example.abstract_factory.factories;

import example.abstract_factory.buttons.Button;
import example.abstract_factory.buttons.WindowsButton;
import example.abstract_factory.checkboxes.Checkbox;
import example.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Created by ycd20 on 2022/07/03
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
