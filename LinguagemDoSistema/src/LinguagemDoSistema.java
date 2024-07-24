import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
        
        Locale linguagem = Locale.getDefault();
        System.out.println("A linguagem atual do sistema é: ");
        System.out.print(linguagem.toString());

    }

}
