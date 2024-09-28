package testeMaria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerStr = new Scanner(System.in);

		String caminho = "S:\\DEV\\Workspaces\\Eclipse\\testeMaria\\src\\testeMaria\\arquivo1.txt";
		while (true) {
			System.out.println("""
					-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
					Qual opcao voce deseja realizar:
					[1] Escrever no arquivo
					[2] Ler no arquivo
					[3] Apagar os dados do arquivo
					[ ] Outro para finalizar o programa
					""");
			int opcao = scannerInt.nextInt();
			if (opcao == 1) {
				FileWriter escritor = new FileWriter(caminho, true);
				System.out.println("-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println("O que voce deseja escrever: ");
				String conteudo = " " + scannerStr.nextLine();
				escritor.write(conteudo);
				escritor.close();
			}else if (opcao == 2) {
				FileReader leitor = new FileReader(caminho);
				BufferedReader bufferLeitor = new BufferedReader(leitor);
				String linha = "";
				System.out.println("-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				while((linha = bufferLeitor.readLine()) != null) {
					System.out.println(linha);
				}
				System.out.println("-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			}else if (opcao == 3){
				FileWriter escritor = new FileWriter(caminho);
			}else {
				break;
			}

		}
		System.out.println("-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Programa finalizado, obrigado pela preferencia!");
	}

} 