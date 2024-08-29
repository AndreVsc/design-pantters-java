public class SinglrtonEager {
    private static SinglrtonEager instance = new SinglrtonEager();
    private SinglrtonEager() {
        // super();
    }
    public static SinglrtonEager getInstance() {
        return instance;
    }
}
