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

}