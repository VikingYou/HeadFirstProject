package example.abstract_factory.factories;

import example.abstract_factory.buttons.Button;
import example.abstract_factory.checkboxes.Checkbox;

/**
 * Created by ycd20 on 2022/07/03
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
