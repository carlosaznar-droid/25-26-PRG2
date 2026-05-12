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
    public void perder(){
banco -= apuesta;   
apuesta = 0
}
public void elimnarDelJuego(){
banco = -1;
}
public void reiniciarBanco(){
    banco = 0;
}public voud blackJack(){
banco += apuesta * 1.5;
apuesta = 0;
}
public void empate(){
apuesta = 0;
}
