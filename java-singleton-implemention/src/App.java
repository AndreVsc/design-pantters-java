public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy instance = SingletonLazy.getInstance();
        SinglrtonEager instance1 = SinglrtonEager.getInstance();
        SingletonLazyHolder instance2 = SingletonLazyHolder.getInstance();

        System.out.println("\n-------------- Singleton Lazy ----------------\n");
        
        System.out.println(instance);
        instance.getInstance();
        System.out.println(instance);
        
        System.out.println("\n------------- Singleton Eager ----------------\n");
        
        System.out.println(instance1);
        instance1.getInstance();
        System.out.println(instance1);
        
        System.out.println("\n---------- Singleton Lazy Holder -------------\n");

        System.out.println(instance2);
        instance2.getInstance();
        System.out.println(instance2);
    }
}
