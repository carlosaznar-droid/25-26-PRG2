class Carrera {
     public static void main(String[] args) {
       
    }

    
    private int caballo1 = 0;
    private int caballo2 = 0;
    private int meta = 40;

     public void jugar() {
        int turno = 1;

        while (caballo1 < meta && caballo2 < meta) {
            System.out.println("TURNO NÚMERO: " + turno);

            avanzarCaballos();
            mostrarPista();

            turno++;
            pausa(); 
        }

        mostrarResultado();
    }

     private void avanzarCaballos() {
        caballo1 += (int) (Math.random() * 3); 
        caballo2 += (int) (Math.random() * 3);
    }
      private void mostrarPista() {
        System.out.println("----------------------------------------------");
        dibujarCarril(caballo1);
        dibujarCarril(caballo2);
        System.out.println("----------------------------------------------\n");
    }

    
    
}
