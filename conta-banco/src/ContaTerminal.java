import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final String MENSAGEM_CONTRATO_FINAL = "Olá %s, obrigado por criar uma conta no nosso banco, sua agência é %s, conta %s, e seu saldo de R$:%s já se encontra disponível para saque.\n";

        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Por favor, digite o número da sua conta");
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o número de sua agência");
        agencia = scanner.next();

        System.out.println("Por favor, digite seu o nome");
        nomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo inicial");
        saldo = scanner.nextDouble();

        System.out.printf(MENSAGEM_CONTRATO_FINAL, nomeDoCliente, agencia, numeroDaConta, saldo);
    }
}
