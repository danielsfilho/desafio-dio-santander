
import entities.ContaBanco;
import exceptions.ContaBancoException;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Knowing and importing the Scanner class
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Display messages to our user
        System.out.print("Por favor, digite o número da conta: ");
        Integer numConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String numAgencia = sc.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        Double saldo = sc.nextDouble();

        // Get the values entered in the terminal
        try{
            ContaBanco conta = new ContaBanco(numConta, numAgencia, cliente, saldo);
            // Display account created message
            System.out.println(conta);
        }catch(ContaBancoException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}