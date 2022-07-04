/*
2 - Faça um programa que receba o salário de um funcionário, 
se o salário for maior ou igual a R$ 1.000,00, mostre o salário 
mais R$ 100,00 de bônus, se for menor do que R$ 1.000,00, o bônus 
será de R$ 50,00. Mostre o novo salário (condicional – if...else) 
*/
package L2;
import java.util.Scanner;
public class L2EX02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sal;
        
        System.out.println("Digite o salário do funcionário:");
        System.out.print("SALÁRIO: R$");
        sal = scan.nextDouble();
        
        if(sal>=1000)
            System.out.println("Novo salário + bónus de R$100,00: R$" + (sal+100));
        else
            System.out.println("Novo salário + bónus de R$50,00: R$" + (sal+50));
        
        scan.close();
    }
}
