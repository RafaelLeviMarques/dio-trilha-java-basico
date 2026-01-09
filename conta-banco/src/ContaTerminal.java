import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + ", e seu saldo de R$:" + saldo + " já se encontra disponível para saque.");
    }
}
