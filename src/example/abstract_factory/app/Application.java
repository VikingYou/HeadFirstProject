package example.abstract_factory.app;

import example.abstract_factory.buttons.Button;
import example.abstract_factory.checkboxes.Checkbox;
import example.abstract_factory.factories.GUIFactory;

/**
 * Created by ycd20 on 2022/07/03
 */
public class Application {
    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
