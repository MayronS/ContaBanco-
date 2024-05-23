import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a sua agência:");
        String agencia = scanner.nextLine();
        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
