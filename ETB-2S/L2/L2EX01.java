/*
1 – Faça um programa que receba dois números 
e mostre o maior. (condicional - if) 
*/
package L2;
import java.util.Scanner;
public class L2EX01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b;
                
        System.out.println("Digite 2 números:");
        
        System.out.print("Número 1:");
        a = scan.nextDouble();
        System.out.print("Número 2:");
        b = scan.nextDouble();
        
        if(a>b)
            System.out.println("O número maior é: " +a);
        if(a<b)
            System.out.println("O número maior é: " +b);
        
        scan.close();
    }   
}
