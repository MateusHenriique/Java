package jogodavelhajava;

import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		
		String matriz[][] = new String[3][3];
		matriz = criaJogo(matriz);
		System.out.print(matriz[0][0]);
		
		Scanner input = new Scanner(System.in);

		System.out.println("escolha com qual voce quer jogar: [X / O]");
		char xouO = input.nextLine().charAt(0);
		
		String jogada = " ";
		escreveJogo(matriz, jogada, xouO);
		System.out.println("\nEm qual posição voce deseja jogar:");
		jogada = input.nextLine();
		escreveJogo(matriz, jogada, xouO);

		
		input.close();
	}
	
	public static String[][] criaJogo(String matrizfunc[][]) {
		
		int cont = 1;
		
		for (int c = 0; c < 3; c++) {
			
			for (int c2 = 0; c2 < 3; c2++) {
				
				matrizfunc[c][c2] = Integer.toString(cont);
				cont++;
				
			}
			
		
		
		
		}
		return matrizfunc;
	}
	
	public static void escreveJogo(String matrizproced[][],String jogada, char xouO) {
		
		for (int c = 0; c < 3; c++) {
			
			System.out.println();
			for (int c2 = 0; c2 < 3; c2++) {
				
				if (matrizproced[c][c2] == jogada) {

					matrizproced[c][c2] = "X";
					System.out.printf(" %s", matrizproced[c][c2]);
				}else {
					System.out.printf(" %s", matrizproced[c][c2]);
				}
			}
		}
		
	}
}
