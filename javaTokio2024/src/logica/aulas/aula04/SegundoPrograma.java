package logica.aulas.aula04;
import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		String nome = input.nextLine();
		System.out.format("Ola, %s", nome);
		
		input.close();
	}

}
