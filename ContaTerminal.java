import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println( "Por favor, digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println( "Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println( "Informe seu nome:");
        String nome = scanner.next();

        System.out.println( "Informe seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println( "Informe o valor a ser depositado:");
        double depositado = scanner.nextDouble();

    System.out.println("CC:" + conta);
        System.out.println("AG:" + agencia);
        System.out.println("Olá " + nome +" " + sobrenome + " " +"seu saldo é:" + depositado);

    }

}
