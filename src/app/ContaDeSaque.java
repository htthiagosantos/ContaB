package app;

import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaDeSaque {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Entre com o numero da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.print("Entre com o titular da conta: ");
        sc.nextLine();
        String titularDaConta = sc.nextLine();

        System.out.print("Tem deposito inicial? (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.print("Entre com o valor inicial para deposito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroDaConta,titularDaConta,depositoInicial);
        }
        else{
            conta = new Conta(numeroDaConta,titularDaConta);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor de deposito: ");
        double valorDeDeposito = sc.nextDouble();
        conta.deposito(valorDeDeposito);
        System.out.println("Dados da conta atualizada:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor de saque: ");
        double sacar = sc.nextDouble();
        conta.sacar(sacar);
        System.out.println("Dados da conta atualizada:");
        System.out.println(conta);













        sc.close();
    }
}
