/*
5 - Faça um programa que receba o salário de um funcionário e o percentual de aumento,
mostre o valor do aumento e o novo salário.
 */
package L1;
import java.util.Scanner;

public class L1EX05 {
    public static void main(String[] args) {
        
        double sal, per, nsal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário e o percentual de aumento:");
        System.out.println();
        
        System.out.print("SALARIO: R$");
        sal = entrada.nextDouble();
        System.out.print("PERCENTUAL:");
        per = entrada.nextDouble();
        System.out.println();
        
        nsal = (sal*(1+(per/100)));
        
        System.out.println("Novo salário é: R$" + nsal);
        entrada.close();  
    }
}
