import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual e o salario de funcionario: ");
        float salario = entrada.nextFloat();
        float aumento_Salario = salario + ((salario/100)*15);
        System.out.printf("O salario do funcionario com um aumento de 15%% foi de R$%.2f para R$%.2f", salario, aumento_Salario);
        entrada.close();
    }

}