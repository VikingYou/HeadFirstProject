package example.abstract_factory;

import example.abstract_factory.app.Application;
import example.abstract_factory.factories.GUIFactory;
import example.abstract_factory.factories.MacOSFactory;
import example.abstract_factory.factories.WindowsFactory;

/**
 * Created by ycd20 on 2022/07/03
 */
public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
