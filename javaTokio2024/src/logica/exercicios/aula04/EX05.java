package logica.exercicios.aula04;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 

		System.out.print("Qual e o seu salario:");
		float salario = input.nextFloat();
		System.out.printf("R$%.2f", salario);
	}

}
