public class App {
    public static void main(String[] args) throws Exception {
        Comportamento sigiloso = new Sigiloso();
        Comportamento normal = new Normal();

        System.out.println("\n------------- Strategy Normal --------------\n");

        Player player = new Player(normal);
        player.mover();

        System.out.println("\n------------ Strategy Sigiloso --------------\n");

        player.setComportamento(sigiloso);
        player.mover();
    }
}
