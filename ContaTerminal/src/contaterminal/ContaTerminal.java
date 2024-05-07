/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaterminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt(); 
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.next(); 
        scanner.nextLine(); 
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine(); // 
        System.out.println("Por favor, digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble(); 
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.%n",
                          nomeCliente, numeroAgencia, numeroConta, saldoInicial);
        scanner.close();
    }
}
