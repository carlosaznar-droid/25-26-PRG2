public class Jugador{
    private int banco;
    private int apuesta;
    private String nombre;
    private Mano mano;
    public Jugador(){
        banco = 100;
        mano = new Mano();
    }
}