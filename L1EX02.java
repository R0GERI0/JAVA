/*
2 - Faça um programa que receba 3 notas, calcule e mostre a média aritmética entre elas.
*/
package L1;
import java.util.Scanner;

public class L1EX02 {
    public static void main(String[] args) {
        
        double n1, n2, n3, media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 notas:");
        System.out.println();
        
        System.out.print("1° NOTA: ");
        n1 = entrada.nextDouble();
        System.out.print("2° NOTA: ");
        n2 = entrada.nextDouble();
        System.out.print("3° NOTA: ");
        n3 = entrada.nextDouble();  
        
        media = (n1+n2+n3)/3;
        
        System.out.println("A media é: " + media);
        entrada.close();
    }
}