import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char fechar = 'N';
        char resposta = 'N';

        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Digite um numero:");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("O numero digitado é PAR!");
            } else {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("O numero digitado é IMPAR!");
            }

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Deseja verificar outro numero? [S/N]");
            resposta = entrada.next().charAt(0);
            if (resposta == fechar) {
                break;
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("PROGRAMA FINALIZADO!!!");
        entrada.close();
    }
}
