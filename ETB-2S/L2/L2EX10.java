/*
10  –Criar  um  algoritmo  que  receba  a  matricula,  idade  
e  o  estado  civil  (1-Casado,  2-Solteiro, 3 -Viúvo e 4-Desquitado) 
de vários funcionários. Calcule e imprima.  

• A quantidade de pessoas casadas; 
• A quantidade de pessoas solteiras com idade entre 20 e 30 anos; 
• A média de idade das pessoas viúvas; 
• A porcentagem de pessoas desquitadas dentre todas as pessoas analisadas 
• A idade da pessoa mais velha 
• A matrícula da pessoa mais nova 
O algoritmo encerra quando se digita um número menor que zero para a matrícula 
*/
package L2;
import java.util.Scanner;
public class L2EX10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, mat=0, id, ec, 
            qtcasado=0, qtsolteira=0, qtviuva=0, qtdesq=0, qtsolteiro=0, 
            idvelho=0, idnovo=200, 
            mviuva=0, matnovo=0;
        
        
        System.out.println("** CADASTRO FUNCIONÁRIO **");
        System.out.println("==========================");
        System.out.println();
        System.out.println("DIGITE OS DADOS ABAIXO:");
        System.out.println("PARA O ESTADO CIVIL ESCOLHER UM NÚMERO:");
        System.out.println("1-CASADO");
        System.out.println("2-SOLTEIRO");
        System.out.println("3-VIÚVO");
        System.out.println("4-DESQUITADO");
        System.out.println();
        System.out.println("PARA FINALIZA DIGITE UM NÚMERO MENOR QUE ZERO PARA A MATRÍCULA.");
        System.out.println();
        
        for(i=1;mat>=0;i++){
            System.out.println();
            System.out.println("CADASTRO N°" + i);
            System.out.print("MATRÍCULA.....:");
            mat = scan.nextInt();
            if(mat>=0){
                System.out.print("IDADE.........:");
                id = scan.nextInt();
                if(id > idvelho)
                    idvelho = id;
                if(id < idnovo){
                    idnovo = id;
                    matnovo = mat;
                }
                System.out.print("ESTADO CIVIL..:");
                ec = scan.nextInt();
                switch(ec){
                    case 1: qtcasado++; 
                            break;
                    case 2: qtsolteiro++;
                            if(id > 20 && id < 30)
                                qtsolteira++; 
                            break;
                    case 3: qtviuva++;
                            mviuva = mviuva+id;
                            break;
                    case 4: qtdesq++;
                            break;
                }
            }
        }
        System.out.println();
        System.out.println("** 1° - RESULTADO **");
        System.out.println("Total de Cadastros.: " + (i-1));
        System.out.println("Total Casados......: " + qtcasado);
        System.out.println("Total Solteiros....: " + qtsolteiro);
        System.out.println("Total Viúvos.......: " + qtviuva);
        System.out.println("Total Desquitados..: " + qtdesq);
        System.out.println();
        System.out.println("** 2° - RESULTADO **");
        System.out.println("A quantidade de pessoas casadas.........................................: " + qtcasado);
        System.out.println("A quantidade de pessoas solteiras com idade entre 20 e 30 anos..........: " + qtsolteira);
        System.out.println("A média de idade das pessoas viúvas.....................................: " + (mviuva/qtviuva));
        System.out.println("A porcentagem de pessoas desquitadas dentre todas as pessoas analisadas.: " + ((qtdesq*100)/(i-1)) + "%");
        System.out.println("A idade da pessoa mais velha............................................: " + idvelho);
        System.out.println("A matrícula da pessoa mais nova.........................................: " + "MAT: " + matnovo + ", Idade: " + idnovo);
        scan.close();
    }
}
