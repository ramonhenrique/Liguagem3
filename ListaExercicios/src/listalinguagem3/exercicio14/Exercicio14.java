/*
 Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma determinada cidade. Para isso, são
 fornecidos os seguintes dados:
 • O preço do kwh consumido;
 • O número do consumidor;
 • A quantidade de kwh; consumidos durante o mês;
 • O código do tipo de consumidor (residencial, comercial, industrial).
 • O número do consumidor igual a zero deve ser usado como flag.
 Fazer um algoritmo que:
 • Leia os dados descritos acima;
 • Calcule:
 a) Para cada consumidor, o total a pagar,
 b) O maior consumo verificado,
 c) O menor consumo para cada um dos três tipos de consumidores,
 d) O total do consumo para cada um dos três tipos de consumidores,
 e) A média geral de consumo;
 • Escreva
 a) Para cada consumidor, o seu número e o total a pagar,
 b) O que foi calculado nos itens b, c, d, e acima especificados.
 */
package listalinguagem3.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    Double preco, qtdeKwh, totalPag, maiorCons = 0.0, menorRes = 999.0,
            menorCom = 999.0, menorInd = 999.0, somaGeral = 0.0, totRes = 0.0,
            totCom = 0.0, totInd = 0.0;
    int numCons, tipoCons, contCons = 0;

    public void Leitura() {
        Scanner s = new Scanner(System.in);
        System.out.println("Preço do kwh consumido: ");
        preco = s.nextDouble();
        System.out.println("Número do consumidor ou 0 para sair: ");
        numCons = s.nextInt();
        while (numCons != 0) {
            System.out.println("Quantidade de kwh consumidos: ");
            qtdeKwh = s.nextDouble();
            System.out.println("Tipo de consumidor:\n1-Residencial.\n2-Comercial."
                    + "\n3-Industrial. ");
            tipoCons = s.nextInt();
            somaGeral += qtdeKwh;
            totalPag = qtdeKwh * preco;
            if (qtdeKwh > maiorCons) {
                maiorCons = qtdeKwh;
            }

            if (tipoCons == 1) {
                totRes += qtdeKwh;
                if (qtdeKwh < menorRes) {
                    menorRes = qtdeKwh;
                }
            } else if (tipoCons == 2) {
                totCom += qtdeKwh;
                if (qtdeKwh < menorCom) {
                    menorCom = qtdeKwh;
                }
            } else if (tipoCons == 3) {
                totInd += qtdeKwh;
                if (qtdeKwh < menorInd) {
                    menorInd = qtdeKwh;
                }
            }
            System.out.println("Número do consumidor: " + numCons + "\tTotal a pagar: R$" + totalPag);
            contCons++;
            System.out.println("Número do consumidor ou 0 para sair: ");
            numCons = s.nextInt();
        }
        Calcular();
    }

    public void Calcular() {
        System.out.println("\nMaior consumo: " + maiorCons + " Kwh");
        System.out.println("\n\tMENORES CONSUMOS");
        System.out.println("Residencial: " + menorRes + " Kwh\tComercial: " + menorCom
                + " Kwh\tIndustrial: " + menorInd + " Kwh");
        System.out.println("\n\tTOTAL DE CONSUMO");
        System.out.println("Residencial: " + totRes + " Kwh\tComercial: " + totCom
                + " Kwh\tIndustrial: " + totInd + " Kwh");
        System.out.println("Média Geral de Consumo: " + (somaGeral / contCons));
    }
}
