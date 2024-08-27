package main;

import java.util.Scanner;
import java.time.LocalDate;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        short anoAtual = (short) date.getYear();    
        byte mesAtual = (byte) date.getMonthValue();

        System.out.print("Em que ano voce nasceu: ");
        short anoNascimento =  Short.parseShort(entrada.nextLine());

        System.out.print("Em que mes voce nasceu: ");
        byte mesNascimento = Byte.parseByte(entrada.nextLine());
        byte idade;

        if (mesAtual < mesNascimento) {
            idade = (byte) ((anoAtual - anoNascimento) - 1);

        } else {
            idade = (byte) ((anoAtual - anoNascimento));
        }
        System.out.printf("A sua idade atual e sua  %d anos", idade);
        entrada.close();
    }
}
