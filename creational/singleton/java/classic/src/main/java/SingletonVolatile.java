public class SingletonVolatile {
    /**
     * Volatile keyword ensures that multiple threads handle the uniqueInstance
     * variable correctly when it is being initialized.
     * With double-checked locking, we first check to see if an instance is created,
     * and if not, THEN we synchronize only the first time through.
     */
    private volatile static SingletonVolatile uniqueInstance;

    private SingletonVolatile() {}

    public static SingletonVolatile getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonVolatile.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonVolatile();
                }
            }
        }
        return uniqueInstance;
    }
}
