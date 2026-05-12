public class Dealer{
    private Mano mano = new Mano();
    public boolean tieneBlackJack(){
        if(mano.getValor() == 21){
            return true;
        
    }else{
        return false;
    }
 }
    public void  jugarCrupier(Mazo baraja){

        System.out.println();

        while(mano.getValor() < 17){
            mano.agregarCarta(baraja.repartirCarta());
        }
    
    if (mano.getValor() > 21){
        System.out.println("El crupier se ha pasado de 21, el jugador gana.");

}else{
        System.out.println("El crupier tiene un valor de " + mano.getValor() + ", el jugador pierde.");
    }

}
public void agregarCarta(Carta carta){
    mano.agregarCarta(carta);
}
}