package supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Supera01 {

	static ArrayList<Integer> entrada = new ArrayList<Integer>();
	static ArrayList<Integer> pares = new ArrayList<Integer>();
	static ArrayList<Integer> impares = new ArrayList<Integer>();

	public static void main(String[] args) {

		entrada();
		saida();

	}

	private static void saida() {

		ArrayList<Integer> saida = new ArrayList<Integer>();

		if (!pares.isEmpty()) {
			Collections.sort(pares);
			saida.addAll(pares);
		}
		if (!impares.isEmpty()) {
			Collections.sort(impares);
			Collections.reverse(impares);
			saida.addAll(impares);
		}

		if (!saida.isEmpty()) {
			for (Integer i : saida) {
				System.out.println(i);

			}
		} else {
			System.out.println("0 entradas");
		}

	}

	public static void entrada() {
		
		System.out.println("PRIMEIRO DESAFIO\n");

		System.out.printf("Entrada de valores inteiros não negativos: ");
		System.out.println();
		Scanner sc;
		int valor = 9;
		for (int i = 0; i < Math.pow(10, 5) && valor != 0; i++) {

			sc = new Scanner(System.in);

			System.out.printf("id:  %d <0-sai>: ", i + 1);

			valor = sc.nextInt();

			if (valor != 0) {
				entrada.add(valor);

				if (entrada.get(i) % 2 == 0) {
					pares.add(entrada.get(i));
				} else {
					impares.add(entrada.get(i));

				}

			} else {

			}

		}

	}

}
