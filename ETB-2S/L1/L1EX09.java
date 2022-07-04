/*
9 - Faça um programa que receba o ano de nascimento e ano atual, 
calcule e mostre a idade atual e a idade em 2080.
 */
package L1;
import java.util.Scanner;

public class L1EX09 {
    public static void main(String[] args) {
        
        int Anasc, Atual;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Ano de Nascimento e Ano Atual:");
        
        System.out.print("NASCIMENTO: ");
        Anasc = entrada.nextInt();
        System.out.print("ANO ATUAL: ");
        Atual = entrada.nextInt();
        
        System.out.println();
        System.out.println();
        System.out.println("IDADE ATUAL...: " + (Atual - Anasc));
        System.out.println("IDADE EM 2080.: " + (2080 - Anasc));
        entrada.close();
    }
    
}
