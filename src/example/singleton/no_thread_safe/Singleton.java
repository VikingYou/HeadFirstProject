package example.singleton.no_thread_safe;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){

    }
}
