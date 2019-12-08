package app;

import java.util.Random;

/*
Generar en un array 20 numeros random (1-20) sin ningun duplicado
sin usar shuffle, list, set, etc. solo random gen.
*/

public class App {
	public static void main(String[] args) throws Exception {
		int k, t;
		int[] cards = new int[20];
		Random random = new Random();

		for (k = 0; k <= 19; k++) {

			cards[k] = random.nextInt(20) + 1;

			for (t = 0; t < k; t++) {

				if (k!=t && cards[k] == cards[t]) {
					cards[k] = random.nextInt(20) + 1;
					t = -1;
				}

			}
		}

		for (k = 0; k <= 19; k++) {
			System.out.println(k + ": " + cards[k]);
		}

	}

}