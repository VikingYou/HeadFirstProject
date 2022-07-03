package example.factory_method;

/**
 * Created by ycd20 on 2022/07/03
 * 具体产品
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says Hello World!");
    }
}
