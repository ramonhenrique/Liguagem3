/*
 Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 50 pessoas. Calcule e escreva:
 A maior e a menor altura do grupo;
 • A média de altura das mulheres;
 • O número de homens.
 */
package listalinguagem3.exercicio03;

import java.util.Scanner;

public class Exercicio3 {

    Scanner scanner = new Scanner(System.in);
    private double maiorAltGrupo;
    private int quntHomens;
    private int quntMulheres;
    private double mediaAltMulheres;
    private int quntPessoas;
    private double altMulheres;
    private double menorAltGrupo;

    public Exercicio3(int quntPessoas) {
        this.quntPessoas = quntPessoas;
    }

    public void altGrupo(double novaAlt) {
        if (maiorAltGrupo < novaAlt) {
            maiorAltGrupo = novaAlt;
        }
        if (menorAltGrupo == 0) {
            menorAltGrupo = novaAlt;
        } else if (menorAltGrupo > novaAlt) {
            menorAltGrupo = novaAlt;
        }
    }

    public double getMaiorAltGrupo() {
        return maiorAltGrupo;
    }

    public double getMenorAltGrupo() {
        return menorAltGrupo;
    }

    public void mediaAltMulheres() {
        mediaAltMulheres = altMulheres / quntMulheres;
        System.out.println("A média de altura entre as mulheres é: " + mediaAltMulheres);
    }

    public void lerDados() {
        double novaAlt;
        char sexo;
        while (quntPessoas > 0) {
            System.out.println("O sexo da pessoa é F(feminino) ou M(masculino)? ");
            sexo = scanner.nextLine().charAt(0);
            if (sexo=='f' ||sexo=='F') {
                quntMulheres++;
                System.out.println("Digite a altura: ");
                novaAlt = scanner.nextDouble();
                altMulheres += novaAlt;
                altGrupo(novaAlt);
            } else if (sexo=='m' || sexo=='M') {
                quntHomens++;
                System.out.println("Digite a altura: ");
                novaAlt = scanner.nextDouble();
                altGrupo(novaAlt);
            }
            quntPessoas--;
        }
        System.out.println("A maior altura do grupo é: " + getMaiorAltGrupo());
        System.out.println("A menor altura do grupo é: " + getMenorAltGrupo());
        mediaAltMulheres();
        System.out.println("A quantidade de homens é: " + quntHomens);
    }

}
