public class SingletonEager {
    // Static eager initialization is guaranteed to be thread safe
    private static SingletonEager uniqueInstance = new SingletonEager();

    // other useful instance variables here

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}
