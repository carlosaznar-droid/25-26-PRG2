public class Mazo{
    private int siguienteCarta;

    Carta[] baraja = new Carta[52];
    public mazo(){
        int contador = 0;
        try {
            for (int i=1;i<=13,i++){
                baraja[contador++] = new Carta(i,"corazones");
            }
            for (int i=1;i<=13,i++){
                baraja[contador++] = new Carta(i,"diamantes");
            }
            for (int i=1;i<=13,i++){
                baraja[contador++] = new Carta(i,"tréboles");
            }
            for (int i=1;i<=13,i++){
                baraja[contador++] = new Carta(i,"picas");
            }

        }
        siguienteCarta = 0;
}
private void comprobarIndice(int indice){
    if (indice<0 || indice>=52){
        throw new IndexOutOfBoundsException("El índice debe estar entre 0 y 51");
    }
}
public String toString(){
    String texto = "";

    for (int i=0; i<baraja.length; i++){
        texto += baraja[i].toString() + "";
    }
   return texto;
}
private void intercambiarCartas(int indice1, int indice2){
    comprobarIndice(indice1);
    comprobarIndice(indice2);

    Carta temp = baraja[indice1];
    baraja[indice1] = baraja[indice2];
    baraja[indice2] = temp;
}