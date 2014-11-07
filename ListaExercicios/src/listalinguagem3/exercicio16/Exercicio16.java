/*
 Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas
 no seu quadro de funcionários, utilizando processamento eletrônico. Supondo que voce seja o programador encarregado
 desse levantamento, fazer um algoritmo que:
 Leia um conjunto de dados para cada candidato contendo:
 a) O número de inscrição do candidato,
 b) A idade,
 c) O sexo (masculino, feminino)
 d) Experiência no serviço (sim ou não)
 O último conjunto contém o número de inscrição do candidato igual a zero.
 • Calcule:
 a) O número de candidatos do sexo feminino,
 b) O número de candidatos do sexo masculino,
 c) A idade média dos homens que já têm experiência no serviço,
 d) A porcentagem dos homens com mais de 45 anos entre o total de homens,
 e) O número de mulheres que têm idade inferior a 35 anos e com experiência no serviço,
 f) A menor idade entre mulheres que já têm experiência no serviço;
 • Escreva:
 a) O número de inscrição das mulheres pertencentes ao grupo descrito no item e.
 b) O que foi calculado em cada item acima especificado.
 */
package listalinguagem3.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    Scanner s = new Scanner(System.in);
    int numInsc,
            idade,
            codExp,
            contFem = 0,
            contMasc = 0,
            somaIdExp = 0,
            contMas45 = 0,
            contFem35Exp = 0,
            menorIdFemExp = 999,
            cont = 0;
    String sexo;
    Double idMedMasExp,
            porcMas45;
    int[] numInscFem35;

    public void pegaDados() {
        System.out.println("Número de inscrição: ");
        numInsc = s.nextInt();
        while (numInsc != 0) {
            System.out.println("Idade: ");
            idade = s.nextInt();
            System.out.println("Sexo: ");
            sexo = s.next();
            System.out.println("Experiência:\n1- Sim.\n2- Não.");
            codExp = s.nextInt();
            if ("masculino".equalsIgnoreCase(sexo)) {
                contMasc++;
            }
            if ("feminino".equalsIgnoreCase(sexo)) {
                contFem++;
            }
            if ("masculino".equalsIgnoreCase(sexo) && codExp == 1) {
                somaIdExp += idade;
            }
            if ("masculino".equalsIgnoreCase(sexo) && idade > 45) {
                contMas45++;
            }
            if ("feminino".equalsIgnoreCase(sexo)) {
                if (idade < menorIdFemExp) {
                    menorIdFemExp = idade;
                }
                if (idade < 35 && codExp == 1) {
                    contFem35Exp++;
                }
                numInscFem35 = new int[contFem35Exp];

                if (idade < 35 && codExp == 1) {
                    numInscFem35[cont] = numInsc;
                    cont++;
                }

            }
            System.out.println("Número de inscrição: ");
            numInsc = s.nextInt();
        }
        calcular();
    }

    public void calcular() {
        idMedMasExp = (double) somaIdExp / contMasc;
        porcMas45 = (double) contMas45 / contMasc * 100;
        System.out.println("NÚMERO DE INCRIÇÃO DAS MULHERES COM IDADE INFERIOR A 35 E EXEPERIÊNCIA:");
        for (int i = 0; i < cont; i++) {
            System.out.println("Inscrição: " + numInscFem35[i]);
        }
        System.out.println("\nCandidatos do sexo feminino: " + contFem);
        System.out.println("Candidatos do sexo masculino: " + contMasc);
        System.out.println("Idade média homens com experiência: " + idMedMasExp);
        System.out.println("Porcentagem dos homens com mais de 45 anos: " + porcMas45 + "%");
        System.out.println("Número de mulheres com menos de 35 anos e experiência: " + contFem35Exp);
        System.out.println("Menor idade entre mulheres com experiência: " + menorIdFemExp);
    }
}
