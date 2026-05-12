public class BlackJackGame {
    
    private Scanner entrada = new Scanner(System.in);
    private int usuarios;
    private Jugador[] jugadores;
    private Baraja baraja;
    private Dealer crupier = new Dealer();

    public void inicializarJuego(){
        String nombres;

        System.out.println("Bienvenido al juego de BlackJack");
        System.out.println("");
        System.out.println(" REGLAS DEL JUEGO ");
        System.out.println("1. El objetivo del juego es acercarse lo más posible a 21 puntos sin pasarse.");
        System.out.println("2. Cada jugador recibe dos cartas al inicio del juego.");
        System.out.println("3. Los jugadores pueden elegir 'Pedir' para recibir otra carta o 'Plantarse' para mantener su mano actual.");
        System.out.println("4. El crupier juega después de que todos los jugadores hayan terminado sus turnos.");
        System.out.println("5. El jugador que tenga la mano más cercana a 21 sin pasarse gana la partida.");
        System.out.println("");

        do {
            System.out.print("Ingrese el número de jugadores (1-4): ");
            usuarios = entrada.nextInt();

        } while (usuarios < 1 || usuarios > 4);

        jugadores = new Jugador[usuarios];
        baraja = new Baraja();

        for(int i=0; i<usuarios; i++){
            System.out.print("Ingrese el nombre del jugador " + (i+1) + ": ");
            nombres = entrada.next();
            jugadores[i] = new Jugador(nombres);
            jugadore[i].establecerNombre(nombres);
        }
    }

    public void barajarCartas(){
        baraja.barajar();

    }
    
       
}   