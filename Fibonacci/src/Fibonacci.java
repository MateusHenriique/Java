import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int termo_1 = 0;    
        int termo_2 = 1;
        System.out.print("Até qual termo da sequencia você deseja ver: ");
        int sequencia = entrada.nextInt();
        System.out.print(termo_1 + " ");
        System.out.print(termo_2 + " ");
        int c = 2;
        
        while (c < sequencia) {
            int termo_3 = termo_1 + termo_2;
            System.out.print(termo_3 + " ");
            termo_1 = termo_2;
            termo_2 = termo_3;
            c++;
        }
    }
}
