/*
4 - Faça um programa que receba o salário de um funcionário, calcule 
e mostre o novo salário,sabendo-se que sofreu um aumento de 25%.
 */
package L1;
import java.util.Scanner;

public class L1EX04 {
    public static void main(String[] args) {
        
        double sal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        System.out.println();
        
        System.out.print("SALARIO: R$");
        sal = entrada.nextDouble();
        System.out.println();
        
        System.out.println("Novo salário é: R$" + (sal*1.25));
        entrada.close();
    }
}