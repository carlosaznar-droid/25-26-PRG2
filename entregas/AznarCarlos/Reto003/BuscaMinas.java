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

	}
}
