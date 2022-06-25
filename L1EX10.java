/*
10 – O valor de um carro novo é igual a soma do preço de fábrica com 
o percentual de lucro do distribuidor o percentual dos impostos aplicados 
ao preço de fábrica. Entre com o preço de fábrica o percentual de lucro 
dos distribuidores e o percentual dos impostos, ao final mostre, o valor do
lucro do distribuidor o valor correspondente aos impostos e o preço de 
venda do veículo.
 */
package L1;
import java.util.Scanner;

public class L1EX10 {
    public static void main(String[] args) {
        
        double preco, lucro, imposto;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("MOSTRA O VALOR DO CARRO:");
        
        System.out.print("PREÇO DE FÁBRICA:");
        preco = entrada.nextDouble();
        System.out.print("PER. LUCRO:");
        lucro = entrada.nextDouble();
        System.out.print("PER. IMPOSTO:");
        imposto = entrada.nextDouble();
        
        System.out.println();
        System.out.println();
        
        System.out.println("VALOR FÁBRICA....:" + preco);
        System.out.println("VALOR LUCRO......:" + (preco*(lucro/100)));
        System.out.println("VALOR IMPOSTO....:" + (preco*(imposto/100)));
        System.out.println("PREÇO DO VEÍCULO.:" + (preco*(1+(lucro/100)+(imposto/100))));
        entrada.close();
    } 
}
