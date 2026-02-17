import java.util.Scanner;

public class BuscaMinas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] tablero = new String[5][7];
        String[][] visible = new String[5][7];

        boolean salida = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = "-";
                visible[i][j] = "-";
            }
        }

        tablero[0][4] = "*";

        while (!salida) {

            imprimirTablero(visible);

            System.out.println("Ingrese X");
            int x = sc.nextInt();

            System.out.println("Ingrese Y");
            int y = sc.nextInt();

            System.out.println("----------------");

            if (tablero[x - 1][y - 1] == "*") {  
                visible[x - 1][y - 1] = "*";
                System.out.println("Mina!");
                salida = true;
            } else {
                visible[x - 1][y - 1] = ".";
                System.out.println("Libre!");
            }
        }

        imprimirTablero(visible);

        sc.close();
    }

    public static void imprimirTablero(String[][] tablero) {

        System.out.println("================");
        System.out.print("  ");

        for (int i = 1; i <= 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 7; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("================");
    }
}
