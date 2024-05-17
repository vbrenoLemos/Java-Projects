import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a sua agência: ");
            String Agencia = sc.next();

            System.out.print("Digite o número de sua agência: ");
            int NumeroAgencia = sc.nextInt();

            System.out.print("Digite seu nome: ");
            String nome = sc.next();

            System.out.print("Digite seu saldo: ");
            double saldo = sc.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta no nosso banco " + "sua agência é " + Agencia + ", sua conta é "+ NumeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}
