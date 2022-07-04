/*
7 – Faça um programa que receba 13 notas, calcule e mostre 
a média aritmética entre elas. (faça usando repetição determinada – while) 
*/
package L2;
import java.util.Scanner;
public class L2EX07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        double soma=0;
        
        System.out.println("Digite 13 notas:");
        while(i<=13){
            System.out.print(i+"° NOTA: ");
            soma=soma+(scan.nextDouble());
            i++;
        }
        System.out.println("A soma das 13 notas é: "+ soma);
        System.out.println("A média das 13 notas é: "+(soma/13));
        scan.close();
    }
}
