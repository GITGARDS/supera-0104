package supera;

import java.util.ArrayList;
import java.util.Scanner;

public class Supera04 {

	public static ArrayList<String> texto = new ArrayList<String>();

	public static void main(String[] args) {

		System.out.println("QUARTO DESAFIO\n");
		
		Scanner ler = new Scanner(System.in);		

		System.out.print("Quantidade de casos de teste: ");

		int casos = ler.nextInt();

		entrada(casos);

		saida();

	}

	private static void entrada(int casos) {
		
		System.out.println();
		System.out.println("Entrada");

		for (int i = 0; i < casos; i++) {

			System.out.printf("linha %d de %d: ", i + 1, casos);

			String frase = readLine(new Scanner(System.in));
			texto.add(frase);
		}

	}

	private static void saida() {
		
		System.out.println();
		System.out.println("Saida");
		
		
		
		int linha = 1;
		for (String string : texto) {

			StringBuilder parte1 = new StringBuilder(string.substring(0, string.length() / 2));
			StringBuilder parte2 = new StringBuilder(string.substring(string.length() / 2, string.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.printf("%d - %s \n", linha, parte1.toString() + parte2.toString());
			linha++;

		}

	}

	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}

}