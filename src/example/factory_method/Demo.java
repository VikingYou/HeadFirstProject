package example.factory_method;

/**
 * Created by ycd20 on 2022/07/03
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBasicLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 8.1")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBasicLogic() {
        dialog.renderWindow();
    }
}
