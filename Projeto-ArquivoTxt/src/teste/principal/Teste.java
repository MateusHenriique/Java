package teste.principal;

import java.io.IOException;
import java.util.Scanner;

import teste.editaarquivo.EditaArquivo;

public class Teste {

	public static void main(String[] args) throws IOException {
		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerStr = new Scanner(System.in);
		int operacao = 0;
		
		System.out.println("Qual o caminho do arquivo que voce deseja criar: ");
		EditaArquivo editaArquivo = new EditaArquivo(scannerStr.nextLine());
		
		System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Qual o nome do arquivo que voce deseja criar: ");
		String nomeArquivo = scannerStr.nextLine();
		editaArquivo.criaArquivo("\\" + nomeArquivo + ".txt");
		
		while (operacao != 4) {
			System.out.println("""
					-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
					Qual operação voce deseja realizar: 
					[1] Escrever no arquivo.
					[2] Ler Arquivo
					[3] Apagar dados do arquivo.
					[4] Sair do programa
					""");
			operacao = scannerInt.nextInt();
			
			switch(operacao) {

				case 1:
					System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println("digite o conteudo que voce deseja adicionar no seu arquivo:  [fim] para finalizar.");
					String conteudo = scannerStr.nextLine();
					while (!conteudo.equals("fim")) {
						conteudo = scannerStr.nextLine();
						editaArquivo.escreveArquivo(conteudo);
					}
					break;
				case 2:
					editaArquivo.lerArquivo();
					break;
				case 3:
					System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					editaArquivo.deletaDadosArquivo();
					System.out.println("Dados deletados com sucesso.");
					break;
				case 4:
					System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println("Programa finalizado!");
					break;
				default:
					System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
					System.out.println("Operação invalida, tente novamente...");
			}
		}
		scannerInt.close();
		scannerStr.close();
		System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		

	}
}
