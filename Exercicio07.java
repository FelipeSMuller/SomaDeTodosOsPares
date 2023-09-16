package Exercicios;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		 * Soma dos Números Pares: Crie um programa que calcule a soma de todos os
		 * números pares de 1 a 100 usando um loop for.
		 */

		int soma = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				soma += i;
				System.out.print(soma + " ");
			}
		}
	}

}
