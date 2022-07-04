/*
5  –  Entre  com  10  números  e  mostre  o  triplo  de  cada  
número.  (faça  usando  repetição determinada – while) 
*/
package L2;
import java.util.Scanner;
public class L2EX05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n;
        int i=1;
        
        System.out.println("DIGITE 10 NÚMEROS:");
        
        while(i<=10){
            System.out.print("N°"+i+": ");
            n = scan.nextDouble();
            System.out.println("Seu triplo é: N°"+i+": " + (n*3));
            i++;
        }
    scan.close();
    }
}
