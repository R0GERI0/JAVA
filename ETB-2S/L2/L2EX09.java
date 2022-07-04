/*
9 – Em uma eleição entre o candidato da chapa de 
número 45 e da chapa de número 13 se  enfrentaram.  
Faça  um  programa  que  receba  o  número  do  
candidato  votado (número 45 ou  número  13).  
Ao  final  mostre  quantas  pessoas  votaram  e  a  
votação  de cada candidato. 
: (faça usando repetição indeterminada) 
O algoritmo encerra quando se digita o número zero 
para o número do candidato 
*/

package L2;
import java.util.Scanner;
public class L2EX09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=1, n13=0, n45=0;
        
        
        System.out.println("** URNA ELETRÔNICA **");
        System.out.println("=====================");
        System.out.println("CANDIDATO DA CHAPA 13.");
        System.out.println("CANDIDATO DA CHAPA 45.");
        System.out.println();
        System.out.println("DIGITE O NÚMEROS DA CHAPA OU ZERO PARA SAIR:");
        
        while(n!=0){
            System.out.print("NÚMERO: ");
            n = scan.nextInt();
            if(n==13||n==45||n==0){
                if(n==13)
                    n13++;
                if(n==45)
                    n45++;
            }else
                System.out.println("CHAPA INVÁLIDA DIGITE NOVAMENTE");
        }    
        System.out.println();
        System.out.println("** RESULTADO **");
        System.out.println("TOTAL DE VOTOS: " + (n13+n45));
        System.out.println("VOTOS CHAPA 13: " + n13);
        System.out.println("VOTOS CHAPA 45: " + n45);
    scan.close();
    }
}
