package jogodavelhajava;

import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String xouO = "X";
		boolean acabou = false;
		String continua = "S";
		
		while (continua.equals("S")) {
			acabou = false;
			String matriz[][] = new String[3][3];
			matriz = criaJogo(matriz);
			String jogada = "0";
			
			
			
			escreveJogo(matriz, jogada, xouO);
			int i = 0, totJogadas = 0;
			
			
			while (acabou == false) {
				
				if(i % 2 == 0) {
					xouO = "X";
				}else {
					xouO = "O";
				}
				i++;
				System.out.printf("\n            vez de %s \n", xouO);
				System.out.println("\nEm qual posicao voce deseja jogar:");
				System.out.print("                ");
				jogada = input.nextLine();
				matriz = escreveJogo(matriz, jogada, xouO);
				acabou = verificaAcabou(matriz, acabou, xouO);
				totJogadas++;
				if (totJogadas == 9 && acabou == false) {
					System.out.println("Deu Velha :(");
					acabou = true;
				}
			}
			System.out.println("\nQuer jogar novamente? [S/N]");
			continua = Character.toString(input.next().charAt(0));
			continua = continua.toUpperCase();
		}
		System.out.println("Game Finalizado");
		
		
		input.close();
	}
	
	static String[][] criaJogo(String matrizFunc[][]) {
		
		int cont = 1;
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {	

					matrizFunc[i][j] = Integer.toString(cont);				
					cont++;
			}
		
		}
		return matrizFunc;
	}

	static String[][] escreveJogo(String matrizFunc[][], String jogada, String xouO) {
		
		System.out.println("\n-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		for (int i = 0; i < 3; i++) {
			
			System.out.println("");
			for (int j = 0; j < 3; j++) {	
				
				if (j == 0) {
					System.out.print("          ");
				}
				if (matrizFunc[i][j].equals(jogada)) {
					
					matrizFunc[i][j] = xouO;
					System.out.printf("%s    ", matrizFunc[i][j]);
				}else {
					System.out.printf("%s    ", matrizFunc[i][j]);
				}
				
			}

		}
		System.out.println("");
		System.out.println("\n-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		return matrizFunc;
	}

	static boolean verificaAcabou(String matrizFunc[][],boolean acabou, String xouO) {

		for (int i = 0; i < 3; i++) {
			
			
			if (matrizFunc[0][i] == xouO && matrizFunc[1][i] == xouO && matrizFunc[2][i] == xouO) {
				System.out.printf("\n%s Ganhou!", xouO);
				acabou = true;
			}
			
			if(matrizFunc[i][0] == xouO && matrizFunc[i][1] == xouO && matrizFunc[i][2] == xouO) {
				System.out.printf("\n%s Ganhou!", xouO);
				acabou = true;
			}
			
		}
		
		if (matrizFunc[0][2] == xouO && matrizFunc[1][1] == xouO && matrizFunc[2][0] == xouO) {
			System.out.printf("\n%s Ganhou!", xouO);
			acabou = true;
		}else if (matrizFunc[0][0] == xouO && matrizFunc[1][1] == xouO && matrizFunc[2][2] == xouO) {
			System.out.printf("\n%s Ganhou!", xouO);
			acabou = true;
		}
		
		return acabou;
	}
	
}