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
    ArrayList<Dados> lista = new ArrayList<Dados>();
    Object listaCursos[] = new Object[0];
    private int contCandidatos = 0;
    private int maiorNumCandPorVaga = 0;
    private int cursomMiorNumCandPorVaga = 0;

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

    public int numCandiPorVaga(int codCurso, int numVagas, int numHomens, int numMulheres) {
        int totalCandidatos = numHomens + numMulheres;
        int numCandiPorVaga = (int)Math.floor(totalCandidatos / numVagas);
        verifNumCandidatos(numCandiPorVaga, codCurso);
        return numCandiPorVaga;
    }

    public void verifNumCandidatos(int numCandiPorVaga, int codCurso) {
        if (maiorNumCandPorVaga<=numCandiPorVaga){
            this.maiorNumCandPorVaga= numCandiPorVaga;
            this.cursomMiorNumCandPorVaga = codCurso;
        }
    }

    public double porcCandFeminino(int numHomens, int numMulheres) {
        int totalCandidatos = numHomens + numMulheres;
        double porcCandFeminino = (numMulheres * 100) / totalCandidatos;
        return porcCandFeminino;
    }

    public void contCandidatos(int quantidade) {
        this.contCandidatos += quantidade;
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
                System.out.println("Informe a quantidade de vagas para o curso " + nCodCurso + ":");
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
        imprimeDados();
    }
    
    public void imprimeDados() {
        for (Dados dados : lista) {
            System.out.println("Curso: "+dados.codCurso);
            System.out.println("Numero de candidatos por vaga: "+numCandiPorVaga(dados.codCurso, dados.numVagas, dados.numHomens, dados.numMulheres));
            System.out.println("Percentual de candidatos do sexo feminino no curso: " +porcCandFeminino(dados.numHomens, dados.numMulheres) + "%");
            System.out.println("------------------------------------------------------------------------------------------------");
        }
        System.out.println("Maior número de candidatos por vaga: curso - "+this.cursomMiorNumCandPorVaga+" com "+this.maiorNumCandPorVaga+" pv");
        System.out.println("total de candidatos: "+this.contCandidatos);
    }
}

/*public double truncate(Double valor, int precisao) {  
 BigDecimal bd = BigDecimal.valueOf(valor);  
 bd = bd.setScale(precisao, BigDecimal.ROUND_DOWN);  
  
 return bd.doubleValue();  
 }  
  
 public static void main(String[] args) {  
  
 Truncar t = new Truncar();  
  
 double d = 12.53346867565d;  
 System.out.println(d);  
 System.out.println(t.truncate(d, 4));  
  
 }  */
