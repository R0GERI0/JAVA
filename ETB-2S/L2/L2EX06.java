/*
6 – Faça um programa que receba 12 números inteiros, 
calcule e mostre a soma desses números. 
(faça usando repetição determinada – for) 
*/
package L2;
import java.util.Scanner;
public class L2EX06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,soma=0;
        
        System.out.println("Digite 12 números inteiros:");
        for(i=1;i<=12;i++){
            System.out.print("N°"+i+": ");
            soma=soma+(scan.nextInt());
        }
        System.out.println("A soma dos números digitados é: "+soma);
    scan.close();
    }  
}
