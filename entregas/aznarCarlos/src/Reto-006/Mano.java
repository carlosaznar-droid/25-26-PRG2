public class Mano {
    private Carta[] mano = new Carta[12];
    private int numCartas = 0;
    public int calcularTotal(){
int total = 0;
       boolean hayAs = false;
        for (int i = 0; i < numCartas; i++) {
            total += mano[i].getValor();
            if (mano[i].getValor() == 1) {
                hayAs = true;
            }
        }
        if (hayAs && total <= 11) {
            total += 10;
        }
        return total;
    }
    }