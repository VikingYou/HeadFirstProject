package designpatterns.singleton.doublechecklocking;

/**
 * @author ycd20
 * @date 2021/12/26
 * @time 22:25
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        //检查实例，如果不存在，就进入同步区块
        if (uniqueInstance == null) {//只有第一次才彻底执行这里的代码
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    //进入区块后，再检查一次，如果仍是null，才创建实例
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
