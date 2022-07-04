/*
8  –  Um  certo  time  de  futebol  que  possui  11  jogadores, 
deseja  saber  algumas características de sua equipe, para isso 
entre com o peso, a idade e a altura de cada um dos jogadores, 
calcule e mostre: (faça usando repetição determinada – for e while, 
isto é você fará dois programas separadamente, um usando o for 
e outro usando o while) 
 
* A quantidade de jogadores com idade inferior a 20 anos; 
* A média de idade do time; 
* A média das alturas dos jogadores com menos de 20 anos; 
* A porcentagem de jogadores com mais de 70kg, 
*/
package L2;
import java.util.Scanner;
public class L2EX08B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A, P, somaA=0;
        int i=1, I, somaI=0, contI=0, contP=0;
        
        System.out.println("** INFORME OS DADOS ABAIXO DO JOGADOR **");
        System.out.println("========================================");
        System.out.println();
        
        while(i<=11){
            System.out.println();
            System.out.println("Jogador N°"+i);
            
            System.out.print("Digite a idade: ");          
            I = scan.nextInt();
            somaI = somaI + I;
            
            System.out.print("Digite o peso: ");
            P = scan.nextDouble();
            if(P > 70)
                contP++;
            
            System.out.print("Digite a altura: ");
            A = scan.nextDouble();
            if(I < 20){
                contI++;
                somaA = somaA + A;
            }
            i++;
        }
        System.out.println();
        System.out.println("1- A quantidade de jogadores com idade inferior a 20 anos: " + contI + " Jogadores");
        System.out.println("2- A média de idade do time: " + (somaI/11) + " Anos");
        System.out.println("3- A média das alturas dos jogadores com menos de 20 anos: " + (somaA/contI));
        System.out.println("4- A porcentagem de jogadores com mais de 70Kg é: " + ((contP*100)/11) + "%");
        scan.close();
    }
}
