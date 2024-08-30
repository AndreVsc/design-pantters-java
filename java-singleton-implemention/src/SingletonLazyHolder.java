public class SingletonLazyHolder {
    private SingletonLazyHolder() {
        // super();
    }
    private static class SingletonHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
    public static SingletonLazyHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }   
}
