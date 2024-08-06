import java.util.Scanner;

public class Tabuda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para ver a tabuada: ");
        int n1 = scanner.nextInt();

        int c = 1;
        int resultado;
        while (c <= 10) {
            resultado = n1 * c; 
            System.out.println(n1 +" x " + c + "= " + resultado);
            c++;
        }

    }
}
