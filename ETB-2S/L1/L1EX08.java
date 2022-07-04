/*
8 - Faça um programa que receba o valor de um depósito e o valor da 
taxa de juros, calcule e mostre o valor do rendimento e valor total 
após o rendimento.
 */
package L1;
import java.util.Scanner;

public class L1EX08 {
    public static void main(String[] args) {
        
        double dep, juros;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do depósito e o valor do juros:");
        
        System.out.print("DEPOSITO:");
        dep = entrada.nextDouble();
        System.out.print("JUROS:");
        juros = entrada.nextDouble();
        System.out.println();
        System.out.println();
        
        System.out.println("DEPOSITO........: " + dep);
        System.out.println("VALOR DO JUROS DE " + juros + "%: " + (dep*(juros/100)));
        System.out.println("IMPOSTO 7%......: " + dep*(1+(juros/100)));
        entrada.close();
    } 
}
