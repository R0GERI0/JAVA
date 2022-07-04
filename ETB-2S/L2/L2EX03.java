/*
3 – Faça um programa que receba dois números e 
execute as opções abaixo, de acordo com a escolha do 
usuário: (faça usando a condicional – switch) 
1 – Média entre os números digitados 
2 – Produto (multiplicação) entre os números digitados 
3 – Divisão do primeiro pelo segundo 
4 – Diferença do maior pelo menor 
Se a opção digitada for inválida, mostre uma mensagem de erro. 
*/
package L2;
import java.util.Scanner;
public class L2EX03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c;
        double a,b;
        
        System.out.println("** DIGITE 2 NÚMEROS: **:");
        System.out.print("N°1:");
        a = scan.nextDouble();
        System.out.print("N°2:");
        b = scan.nextDouble();
        System.out.println();
        System.out.println("** DIGITE UMA DAS OPÇÕES **:");
        System.out.println();
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Produto (multiplicação) entre os números digitados");
        System.out.println("3 - Divisão do primeiro pelo segundo");
        System.out.println("4 - Diferença do maior pelo menor");
        c = scan.nextInt();
        
        switch(c){
            case 1:
                System.out.println("A média dos números é: " + (a+b)/2);
                break;
            case 2:
                System.out.println("O produto dos números é: " + (a*b));
                break;
            case 3:
                System.out.println("A divisão do primeiro pelo segundo é: " + (a/b));
                break;
            case 4:
                if(a>b)
                    System.out.println("A diferença dos números é: " + (a-b));
                else
                    System.out.println("A diferença dos números é: " + (b-a));
                break;
            default:
                System.out.println("Nenhuma opção válida digitada.");
                break;
        }
        
        scan.close();
    } 
}
