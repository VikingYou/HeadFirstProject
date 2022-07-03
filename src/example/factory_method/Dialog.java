package example.factory_method;

/**
 * Created by ycd20 on 2022/07/03
 * 基础创建者
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
