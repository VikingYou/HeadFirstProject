package example.abstract_factory.factories;

import example.abstract_factory.buttons.Button;
import example.abstract_factory.buttons.MacOSButton;
import example.abstract_factory.checkboxes.Checkbox;
import example.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Created by ycd20 on 2022/07/03
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
