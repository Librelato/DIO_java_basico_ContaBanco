import java.nio.charset.Charset;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int contaNumero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());

        exit = false;
        do {
            System.out.println("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
            if (nomeCliente.isBlank() || nomeCliente.isEmpty()) {
                System.out.println("Nome do cliente deve ser preechido!!!");
            }
            else if ((nomeCliente.length()<3) || (nomeCliente.length()>100)){
                System.out.println("Nome do cliente deve conter entre 3 e 100 caracteres!!!");
            } else {
                exit = true;
            }
        } while (!exit);
        
        exit = false;
        do {
            System.out.println("Por favor, digite o número e digito da Agência:");
            agencia = scanner.next();
            if (agencia.isBlank() || agencia.isEmpty()) {
                System.out.println("Agência deve ser preechido!!!");
            }
            else if ((agencia.length()<3) || (agencia.length()>6)){
                System.out.println("Agência deve conter entre 3 e 6 caracteres!!!");
            } else {
                exit = true;
            }
        } while (!exit);

        exit = false;
        do {
            System.out.println("Por favor, digite o número da conta:");
            contaNumero = scanner.nextInt();
            if (contaNumero==0) {
                System.out.println("Numero da conta deve ser preechido!!!");
            } else {
                exit = true;
            }
        } while (!exit);

        exit = false;
        do {
            System.out.println("Por favor, digite o saldo da conta:");
            saldo = scanner.nextDouble();
            if (saldo==0) {
                System.out.println("Saldo da conta deve ser preechido!!!");
            } else {
                exit = true;
            }
        } while (!exit);

        scanner.close();

        String message = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.";
        System.out.println(String.format(message, nomeCliente, agencia, contaNumero, saldo));
    }
}
