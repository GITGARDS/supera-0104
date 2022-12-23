package supera;

import java.util.Scanner;

public class Supera02 {

	public static double entrada;
	public static double notas[] = { 100, 50, 20, 10, 5, 2 };
	public static double moedas[] = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

	public static void main(String[] args) {

		entrada = entrada();

		double notas = notas(entrada);
		moedas(notas);

	}

	public static double entrada() {
		
		System.out.println("SEGUNDO DESAFIO\n");		
		
		Scanner valor = new Scanner(System.in);

		System.out.println("Informe um valor: ");

		double ret =  valor.nextDouble();

		return ret;
	}

	private static double notas(double valor) {

		System.out.println();
		System.out.println("NOTAS:");

		for (double d : notas) {

			if (valor >= d) {
				int resultado = (int) (valor / d);
				valor = valor - (resultado * d);
				console(resultado, "nota", d);

			} else {
				console(0, "nota", d);

			}

		}

		return valor;

	}

	private static void moedas(double valor) {

		System.out.println();
		System.out.println("MOEDAS:");

		for (double d : moedas) {

			if (valor >= d) {
				int resultado = (int) (valor / d);
				valor = valor - (resultado * d);
				console(resultado, "moeda", d);

			} else {
				console(0, "moeda", d);

			}

		}

	}

	private static void console(int nm, String display, double tipo) {

		System.out.printf("%3d %s(s) de R$  %10.2f\n", nm, display, tipo);

	}

}
