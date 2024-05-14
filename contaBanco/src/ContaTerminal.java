import java.util.Scanner;

//Exercício java com intuito de praticar interações via terminal
//Simulador de terminal bancário

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scann = new Scanner(System.in);
        double saldo = 237.48;

        System.out.println("Digite seu primeiro nome:");
        String nome = scann.next();

        System.out.println("Digite o número da agência: ");
        String agencia = scann.next();

        System.out.println("Digite o numero da conta:");
        int numConta = scann.nextInt();

        System.out.println("Senhor(a) "+nome+", obrigado por ter uma conta em nosso banco, sua agência é "+agencia+", conta número "+numConta+" e seu saldo é de R$"+saldo);
    }
}
