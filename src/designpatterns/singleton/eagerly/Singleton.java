package designpatterns.singleton.eagerly;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 22:23
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
