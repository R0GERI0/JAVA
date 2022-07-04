/*
7 - Faça um programa que receba o salário base de um funcionário, 
calcule e mostre o seu salário a receber, sabendo-se que o funcionário 
tem gratificação de R$ 50 e imposto de 10% sobre o salário base.
 */
package L1;
import java.util.Scanner;

public class L1EX07 {
    public static void main(String[] args) {
        
        double sal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        
        System.out.print("SALARIO:");
        sal = entrada.nextDouble();
        System.out.println();
        System.out.println();
        
        System.out.println("SALARIO........:  " + sal);
        System.out.println("GRATIFICAÇÃO 5%: +" + 50);
        System.out.println("IMPOSTO 7%.....: -" + (sal*0.1));
        System.out.println("RECEBER........:  " + ((sal+50)-(sal*0.1)));
        entrada.close();
    } 
}
