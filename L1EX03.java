/*
3 - Faça um programa que receba 3 notas e os seus respectivos pesos, 
calcule e mostre a média ponderada.
 */
package L1;
import java.util.Scanner;

public class L1EX03 {
    public static void main(String[] args) {
        
        double n1, n2, n3, p1, p2, p3, media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 notas e o peso de cada nota:");
        System.out.println();
        
        System.out.print("1° NOTA: ");
        n1 = entrada.nextDouble();
        System.out.print("1° PESO: ");
        p1 = entrada.nextDouble();
        System.out.print("2° NOTA: ");
        n2 = entrada.nextDouble();
        System.out.print("1° PESO: ");
        p2 = entrada.nextDouble();
        System.out.print("3° NOTA: ");
        n3 = entrada.nextDouble();
        System.out.print("1° PESO: ");
        p3 = entrada.nextDouble();
        
        media = ((n1*p1+n2*p2+n3*p3)/(p1+p2+p3));
        
        System.out.println("A média ponderada é:" + media);
        entrada.close();
    }  
}
