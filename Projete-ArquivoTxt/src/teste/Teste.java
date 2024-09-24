package teste;

import java.io.IOException;
import java.util.Scanner;

import teste.cria.Cria;

public class Teste {

	public static void main(String[] args) throws IOException {
		Cria cria = new Cria();
		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerStr = new Scanner(System.in);
		int operacao = 0;
		
		while (operacao != 4) {
			System.out.println("""
					-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
					Qual operação voce deseja realizar: 
					[1] Criar arquivo.
					[2] Escrever no arquivo.
					[3] Ler Arquivo
					[4] Sair do programa
					""");
			operacao = scannerInt.nextInt();
			
			switch(operacao) {
				case 1:
					System.out.println("Qual o nome do arquivo que voce deseja criar: ");
					String nomeArquivo = scannerStr.nextLine();
					System.out.println("Em qual caminho voce deseja criar o carquivo: ");
					String caminho = scannerStr.nextLine();
					cria.criaArquivo(caminho + "\\" + nomeArquivo + ".txt");
					break;
				case 2:
					System.out.println("digite o conteudo que voce deseja adicionar no seu arquivo: ");
					String conteudo = scannerStr.nextLine();
					cria.escreveArquivo(conteudo);
					break;
				case 3:
					cria.lerArquivo();
					break;
				case 4:
					System.out.println("Finalizando programa...");
					break;
				default:
					System.out.println("Operacao invalida...");
					break;
			}
		}
		scannerInt.close();
		scannerStr.close();
	}
}