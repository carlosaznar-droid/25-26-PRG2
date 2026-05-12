public class Jugador{
    private int banco;
    private int apuesta;
    private String nombre;
    private Mano mano;
    public Jugador(){
        banco = 100;
        mano = new Mano();
    }
    public int obtenerBanco(){
        return banco;
    }
    public void pasarse(){
banco -= apuesta;
apuesta = 0;
    }
    public void ganar(){
banco += apuesta;
apuesta = 0;
    }
}