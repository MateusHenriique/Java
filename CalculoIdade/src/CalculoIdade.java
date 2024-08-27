import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nEm que ano estamos: ");
        short ano_Atual = entrada.nextShort();
        System.out.print("Em que ano você nasce: ");
        short ano_Nascimento = entrada.nextShort();
        byte idade = (byte) (ano_Atual - ano_Nascimento);

        /*OBS: não adicionei a validacão de idade referente ao mes de nascimento
         * entao a idade pode estar com uma pequena diferença caso a pessoa nao tenha fito aniversario
         * no mes de execução do programa.
        */

        System.out.printf("Aidade atual é sua  %d anos", idade);

        entrada.close();
    }
}
