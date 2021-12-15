public class SingletonThreadSafe {
    private static SingletonThreadSafe uniqueInstance;

    // other useful instance variables here

    private SingletonThreadSafe() {}

    /**
     * Synchronized keyword forces every thread to wait
     * its turn before it can enter the method.
     * No two methods may enter the method at the same time.
     * @return SingletonTreadSafe
     */
    public static SingletonThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonThreadSafe();
        }
        return uniqueInstance;
    }

    // Other useful methods
}
