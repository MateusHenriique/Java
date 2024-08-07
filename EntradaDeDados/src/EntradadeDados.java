import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);

    }
    
}