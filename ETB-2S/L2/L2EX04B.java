/*
4 -  Uma empresa concederá um aumento variável de salário 
aos seus funcionários, de acordo com o cargo, conforme a tabela 
abaixo. Faça um programa que leia o salário e o código do  cargo 
de um funcionário e calcule o novo salário. Se o cargo do funcionário 
não  estiver  na  tabela,  ele  deverá,  então,  receber  40%  de  
aumento.  Mostre  o  salário antigo, o novo salário e a diferença. 
(faça usando as condicionais – switch e composta, isto é 
você fará dois programas separadamente) 
Código  Cargo  Percentual 
101   Gerente   10%  
102   Engenheiro  20%  
103   Técnico   30%  
*/
package L2;
import java.util.Scanner;
public class L2EX04B {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        double sal;
        int c;
        
        System.out.println("CÓDIGO      CARGO       PERCENTUAL");
        System.out.println("==================================");
        System.out.println(" 101        Gerente         10%");
        System.out.println(" 102        Esgenheiro      20%");
        System.out.println(" 103        Técnico         30%");
        System.out.println();
        
        System.out.println("Digite o salário do funcionário:");
        System.out.print("SALÁRIO: R$");
        sal = scan.nextDouble();
        
        System.out.println("Digite o código do cargo:");
        System.out.print("CÓDIGO: ");
        c = scan.nextInt();
        System.out.println();
        
        
        if(c==101)
            System.out.println("Salario antigo: R$"+sal+" | Salário Novo: R$"+(sal*1.1)+" | Diferença: R$"+(sal*0.1));
        else if(c==102)    
                System.out.println("Salario antigo: R$"+sal+" | Salário Novo: R$"+(sal*1.2)+" | Diferença: R$"+(sal*0.2));
            else if(c==103)
                    System.out.println("Salario antigo: R$"+sal+" | Salário Novo: R$"+(sal*1.3)+" | Diferença: R$"+(sal*0.3));
                else
                    System.out.println("Salario antigo: R$"+sal+" | Salário Novo: R$"+(sal*1.4)+" | Diferença: R$"+(sal*0.4));
        
        scan.close();
    }
}
