package jogodavelhajava;

public class JogoDaVelha {

	public static void main(String[] args) {
		escreveJogo();
		
		
	}
	
	public static int[][] criaJogo(int matrizfunc[][]) {
		
		int cont = 1;
		
		for (int c = 0; c < 3; c++) {
			
			for (int c2 = 0; c2 < 3; c2++) {
				
				matrizfunc[c][c2] = cont;
				cont++;
				
			}
			
		
		
		
		}
		return matrizfunc;
	}
	
	public static void escreveJogo() {
		
		int matrizproced[][] = new int [3][3];
		matrizproced = criaJogo(matrizproced);
		for (int c = 0; c < 3; c++) {
			
			System.out.println();
			for (int c2 = 0; c2 < 3; c2++) {
				
				System.out.printf(" %d", matrizproced[c][c2]);
			}
		}
		
	}
}
