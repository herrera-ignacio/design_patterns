public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {}

    // NOT THREAD-SAFE!
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            // Lazy creation
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Other useful methods
}
