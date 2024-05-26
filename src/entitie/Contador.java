package entitie;

import java.util.Locale;
import java.util.Scanner;

import exceptions.parametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		int paramentroUm = terminal.nextInt();
		int paramentroDois = terminal.nextInt();

		int subtracao = paramentroDois - paramentroUm;

		if (validarDados(paramentroUm, paramentroDois) == false) {
			for (int i = 1; i <= subtracao; i++) {
				System.out.println("imprimindo o numero " + i);
			}

		}

		terminal.close();

	}

	public static boolean validarDados(int numero1, int numero2) throws parametrosInvalidosException {
		if (numero1 > numero2) {
			throw new parametrosInvalidosException("o segundo parâmetro deve ser maior que o primeiro");

		}
		return false;

	}

}
