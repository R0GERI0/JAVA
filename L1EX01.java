/*
1 – Faça um programa que receba 4 números inteiros, calcule e mostre a soma desses números.
*/
package L1;
import java.util.Scanner;

public class L1EX01 {
    public static void main(String[] args) {
        
        int n1, n2, n3, n4, soma;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 4 números inteiros:");
        System.out.println();
        
        System.out.print("1° NÚMERO: ");
        n1 = entrada.nextInt();
        System.out.print("2° NÚMERO: ");
        n2 = entrada.nextInt();
        System.out.print("3° NÚMERO: ");
        n3 = entrada.nextInt();
        System.out.print("4° NÚMERO: ");
        n4 = entrada.nextInt();
        
        soma = n1+n2+n3+n4;
        
        System.out.println("A soma é: " + soma);
        entrada.close();
    }
}
