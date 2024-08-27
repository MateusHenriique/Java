package logica.exercicios.aula04;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		System.out.printf(nome);

		input.close();
	}

}
