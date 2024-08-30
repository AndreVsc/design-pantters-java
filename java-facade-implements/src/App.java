public class App {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();

        System.out.println("\n--------------- Facade ----------------\n");

        facade.migrarCliente("João", "01001000");
    }
}
