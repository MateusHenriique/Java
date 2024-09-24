package teste.cria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cria {
	private String caminho;
	
	public void criaArquivo(String caminho) throws IOException {
		this.caminho = caminho;
		FileWriter escritor = new FileWriter(getCaminho());
		escritor.write("Este e um arquivo criado em por um codigo java");
		escritor.close();
	}
	
	public void escreveArquivo(String conteudo) throws IOException {
		FileWriter escritor = new FileWriter(getCaminho(), true);
		escritor.write("\n" + "\n " + conteudo);
		escritor.close();
	}
	
	public void lerArquivo() throws IOException {
		FileReader leitor = new FileReader(getCaminho());
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = "";
		while((linha = buffer.readLine()) != null) {
			System.out.println(linha);
		}
		buffer.close();
	}
	
	public String getCaminho() {
		return this.caminho;
	}
}