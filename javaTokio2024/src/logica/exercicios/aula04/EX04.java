package logica.exercicios.aula04;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite sua idade: ");
		byte idade = input.nextByte();
		
		System.out.printf("Ola, %s. Voce tem %d anos", nome, idade);
		
		input.close();

	}

}
