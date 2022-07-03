package example.factory_method;

/**
 * Created by ycd20 on 2022/07/03
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
       return new HtmlButton();
    }
}
