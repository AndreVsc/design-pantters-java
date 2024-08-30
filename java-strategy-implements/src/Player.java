public class Player {
    private Comportamento comportamento;
    
    public Player(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
    public void mover() {
        comportamento.mover();
    }
    
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
}
