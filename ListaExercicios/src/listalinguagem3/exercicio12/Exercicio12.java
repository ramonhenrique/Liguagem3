/*
 Uma universidade deseja fazer um levantamento a respeito de seu concurso vestibular. Para cada curso, é fornecido o
 seguinte conjunto de valores:
    • O código do curso;
    • O número de vagas;
    • O número de candidatos do sexo masculino;
    • O número de candidatos do sexo feminino;
 O último conjunto, para indicar fim de dados, contém o código do curso igual a zero. Fazer um algoritmo que:
     • Calcule e escreva, para cada curso, o número de candidatos por vaga e a porcentagem de candidatos do sexo feminino
 (escreva também o código correspondente do curso);
    • Determine o maior número de candidatos por vaga e escreva esse número juntamente com o código do curso
 correspondente (supor que não haja empate);
    • Calcule e escreva o total de candidatos.
 */
package listalinguagem3.exercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {

    Scanner s = new Scanner(System.in);
    ArrayList lista = new ArrayList();
    Object listaCursos[] = new Object[0];
    private int contCandidatos = 0;

    public void setadadosCurso(int nCodCurso, int nNumVagas, int nNumHomens, int nNumMulheres) {
        Dados curso = new Dados();
        curso.codCurso = nCodCurso;
        curso.numVagas = nNumVagas;
        curso.numHomens = nNumHomens;
        curso.numMulheres = nNumMulheres;
        listaCursos(curso);
    }

    public void listaCursos(Dados curso) {
        lista.add(curso);
    }

//    public void numCandidatosPorVaga() {
//        //listaCursos = lista.toArray();
//
//        for (int i = 0; i < lista.size(); i++) {
//            Object x = lista.get(i);
//            System.out.println(x.toString());
//        }
//
//        for (Object dadosCurso : lista) {
//            Object nomeCurso = dadosCurso.hashCode();
//            int cont = 0;
//        }
//
//        for (int i = 0; i < listaCursos.length; i++) {
//            Object curso = listaCursos[i];
//            String a = curso.toString();
//        }
//    }

    public void contCandidatos(int quantidade) {
        contCandidatos += quantidade;
    }

    public void leitura() {
        int nCodCurso = -1;
        int nNumVagas;
        int nNumHomens;
        int nNumMulheres;
        while (nCodCurso != 0) {
            System.out.println("Informe o código do curso: ");
            nCodCurso = s.nextInt();
            if (nCodCurso != 0) {
                System.out.println("Informe a quantidade de gavas para o curso " + nCodCurso + ":");
                nNumVagas = s.nextInt();
                System.out.println("Informe o número de candidatos do sexo masculino:");
                nNumHomens = s.nextInt();
                contCandidatos(nNumHomens);
                System.out.println("Informe o número de candidatos do sexo feminino: ");
                nNumMulheres = s.nextInt();
                contCandidatos(nNumMulheres);
                setadadosCurso(nCodCurso, nNumVagas, nNumHomens, nNumMulheres);
            }
        }
        //numCandidatosPorVaga();
    }

}
