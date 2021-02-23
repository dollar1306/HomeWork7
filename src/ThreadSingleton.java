public class ThreadSingleton {

    private static final Object instance = new Object();

    protected ThreadSingleton() { }

    // Runtime initialization
    // By defualt ThreadSafe
    public static Object getInstance() {
        return instance;
    }
}


