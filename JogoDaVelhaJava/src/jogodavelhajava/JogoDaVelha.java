package jogodavelhajava;

import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		
		String matriz[][] = new String[3][3];
		matriz = criaJogo(matriz);
		String jogada = "0";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("escolha com qual voce quer jogar: [X / O]");
		char xouO = input.nextLine().charAt(0);
		System.out.println(xouO);
		
		boolean acabou = false;
		
		while (acabou == false) {
			System.out.println("\nEm qual posicao voce deseja jogar:");
			jogada = input.nextLine();
			matriz = escreveJogo(matriz, jogada, xouO);
			acabou = verificaAcabou(matriz, acabou);
		}
		
		input.close();
	}
	
	public static String[][] criaJogo(String matrizFunc[][]) {
		
		int cont = 1;
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {	

					matrizFunc[i][j] = Integer.toString(cont);				
					cont++;
			}
		
		}
		return matrizFunc;
	}

	public static String[][] escreveJogo(String matrizFunc[][], String jogada, char xouO) {
		for (int i = 0; i < 3; i++) {
			
			System.out.println("");
			for (int j = 0; j < 3; j++) {	
				
				if (matrizFunc[i][j].equals(jogada)) {
					
					matrizFunc[i][j] = Character.toString(xouO);
					System.out.printf("%s ", matrizFunc[i][j]);
				}else {
					System.out.printf("%s ", matrizFunc[i][j]);
				}
				
			}
		
		}
		return matrizFunc;
	}

	public static boolean verificaAcabou(String matrizFunc[][],boolean acabou) {
	
		for (int i = 0; i < 3; i++) {
			
			if(matrizFunc[i][0].equals("X") && matrizFunc[i][1].equals("X") && matrizFunc[i][2].equals("X")) {
				System.out.println("\nX Ganhou!");
				acabou = true;
			}
		}
		
	/*	if(matrizFunc[0][0].equals("X") && matrizFunc[0][1].equals("X") && matrizFunc[0][2].equals("X")) {
			System.out.println("\nX Ganhou!");
			acabou = true;
		}else if (matrizFunc[1][0].equals("X") && matrizFunc[1][1].equals("X") && matrizFunc[1][2].equals("X")) {
			System.out.println("\nX Ganhou!");
			acabou = true;
		}else if (matrizFunc[2][0].equals("X") && matrizFunc[2][1].equals("X") && matrizFunc[2][2].equals("X")) {
			System.out.println("\nX Ganhou!");
			acabou = true;
		}*/
		
		return acabou;
	}
		

	
}