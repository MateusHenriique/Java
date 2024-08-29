package jogodavelhajava;

import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		
		String matriz[][] = new String[3][3];
		String jogada = "0";
		
		Scanner input = new Scanner(System.in);

		System.out.println("escolha com qual voce quer jogar: [X / O]");
		char xouO = input.nextLine().charAt(0);
		System.out.println(xouO);
		
		criaJogo(matriz, jogada, xouO);
		System.out.println("\nEm qual posicao voce deseja jogar:");
		jogada = input.nextLine();
		criaJogo(matriz, jogada, xouO);

		
		input.close();
	}
	
	public static String[][] criaJogo(String matrizFunc[][], String jogada, char xouO) {
		
		String xouO2  = Character.toString(xouO);
		int cont = 1;
		
		for (int c = 0; c < 3; c++) {
			
			System.out.println();
			for (int c2 = 0; c2 < 3; c2++) {	
				
				if (matrizFunc[c][c2] == jogada) {
						
					matrizFunc[c][c2] = xouO2;
					System.out.printf(" %s", matrizFunc[c][c2]);
					cont++;
					
				}else {
					matrizFunc[c][c2] = Integer.toString(cont);
					System.out.printf(" %s", matrizFunc[c][c2]);
					cont++;
				}
				
			}
			
		
		
		
		}
		return matrizFunc;
	}
	
}
