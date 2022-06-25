/*
6 - Receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se
que o funcionário tem 5% de gratificação sobre o salário base e paga imposto de 7% sobre este
salário.
 */
package L1;
import java.util.Scanner;

public class L1EX06 {
    public static void main(String[] args) {
        
        double sal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        
        System.out.print("SALARIO:");
        sal = entrada.nextDouble();
        System.out.println();
        System.out.println();
        
        System.out.println("SALARIO........:  " + sal);
        System.out.println("GRATIFICAÇÃO 5%: +" + (sal*0.05));
        System.out.println("IMPOSTO 7%.....: -" + ((sal*1.05)*0.07));
        System.out.println("RECEBER........:  " + ((sal*1.05)*0.93));
        entrada.close();
    } 
}
