package supera;

public class Supera03 {

	private static int arr[] = { 1, 5, 3, 4, 2 };

	public static void main(String[] args) {

		int k = 2;

		int valor = problema(k, arr.length);

		System.out.printf("Número de pares %d\n", valor);

	}

	private static int problema(int k, int n) {
		
		System.out.println("TERCEIRO DESAFIO\n");		
		

		int ret = 0;

		for (int i = 1; i < n; i++) {

			int v1 = arr[i - 1];
			int v2 = arr[i];

			System.out.printf("%d-%d=%d\n", v2, v1, (v2 - v1));

			if ((v2 - v1) == k) {
				ret++;

			}

		}

		return ret;
	}

}
