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
				System.out.println("Mala suerte has encontrado una mina");
				salida = true;
			} else {
				visible[x - 1][y - 1] = ".";
				System.out.println("Esta Libre no hay mina");
			}
		}

		sc.close();
	}
}
