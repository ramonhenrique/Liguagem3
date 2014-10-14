/*
O sistema de avaliação de uma determinada disciplina obedece aos seguintes critérios:
    • Durante o semestre são dadas três notas;
    • A nota final é obtida pela média aritmética das notas dadas durante o curso;
    • É considerado aprovado o aluno que obtiver a nota final superior ou igual a 60 e que tiver comparecido a um mínimo de 40
aulas.
Fazer um algoritmo que:
a) Leia um conjunto de dados contendo o número de matrícula, as três notas e a freqüência (números de aulas freqüentadas)
de 100 alunos.
b) Calcule:
    • A nota final de cada aluno;
    • A maior e a menor nota da turma;
    • A nota média da turma;
    • O total de alunos reprovados;
    • A porcentagem de alunos reprovados por infreqüência.
c) Escreva:
    • Para cada aluno, o número de matrícula, a freqüência, a nota final e o código (aprovado ou reprovado);
    • O que foi calculado no item b (2, 3, 4 e 5).
 */
package listalinguagem3.exercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio13 extends ConjuntoDados{
    Scanner s= new Scanner(System.in);
    private int contAlunos; 
    ArrayList<ConjuntoDados> alunos = new ArrayList<>();
    
    public Exercicio13(int contAlunos) {
        this.contAlunos = contAlunos;
    }
    
    public void objetoConjuntoDados(int matricula, double nota1, double nota2, double nota3, int frequencia){
        ConjuntoDados dados = new ConjuntoDados();
        dados.matricula=matricula;
        dados.nota1=nota1;
        dados.nota2=nota2;
        dados.nota3=nota3;
        dados.frequencia=frequencia;
        dados.notaFinal = mediaFinalPorAluno(nota1,nota2,nota3);
        dados.codigo=situacaoAluno(frequencia, dados.notaFinal);
        alunos.add(dados);
    }
    
    public double mediaFinalPorAluno(double nota1, double nota2, double nota3){
            double media = (nota1+nota2+nota3)/3;
        return media;
    }
    
    public double mediaTurma(){
        double mediaTurma=0;
        double somaNotasFinal=0;
        for (ConjuntoDados aluno : alunos) {
            somaNotasFinal+=aluno.notaFinal;
        }
        mediaTurma = somaNotasFinal/contAlunos;
        return mediaTurma;
    }
    
    public double maiorNota(){
        double maiorNota=-1;
        for (ConjuntoDados aluno : alunos) {
            if (maiorNota<aluno.notaFinal)
                maiorNota=aluno.notaFinal;
        }
        return maiorNota;
    }
    
    public double menorNota(){
        double menorNota=1000;
        for (ConjuntoDados aluno : alunos) {
            if (menorNota>aluno.notaFinal)
                menorNota=aluno.notaFinal;
        }
        return menorNota;
    }
    
    public String situacaoAluno(int frequencia, double notaFinal){
        String situacao;
        if(notaFinal>=6.0 && frequencia>=40)
            situacao="Aprovado";
        else
            situacao="Reprovado";
        return situacao;
    }
    
    public int totalReprovados(){
        String situacao;
        int totalReprovados=0;
        for (ConjuntoDados aluno : alunos) {
            situacao = aluno.codigo;
            if (situacao.equalsIgnoreCase("Reprovado"))
                totalReprovados++;
        }
        return totalReprovados;
    }
    
    public double porcReprovaFalta(){
        double porcReprovados;
        int frequencia;
        int cont=0;
        for (ConjuntoDados aluno : alunos) {
            frequencia = aluno.frequencia;
            if (frequencia<40)
                cont++;
        }
        porcReprovados=(cont*100)/this.contAlunos;
        return porcReprovados;
    }
    
    public void leitura(){
        int cont = contAlunos;
        while(cont>0){
            System.out.println("informe a matricula do aluno: ");
            matricula=s.nextInt();
            System.out.println("informe a nota 1: ");
            nota1=s.nextDouble();
            System.out.println("informe a nota 2: ");
            nota2=s.nextDouble();
            System.out.println("informe a nota 3: ");
            nota3=s.nextDouble();
            System.out.println("Informe o numero de aula frequentadas: ");
            frequencia=s.nextInt();
            objetoConjuntoDados(matricula, nota1, nota2, nota3, frequencia);
            cont--;
        }
    }
    
    public void imprimiDados(){
        for (ConjuntoDados aluno : alunos) {
            System.out.println("Matricula: "+aluno.matricula);
            System.out.println("Frequencia: "+aluno.frequencia);
            System.out.println("Nota Final: "+aluno.notaFinal);
            System.out.println("Situação: "+aluno.codigo);
            System.out.println("                             ");
        }
        System.out.println("Maior nota final da turma: "+maiorNota());
        System.out.println("Menor nota final da turma: "+menorNota());
        System.out.println("Nota média da turma: "+mediaTurma());
        System.out.println("Total de reprovações: "+totalReprovados());
        System.out.println("Percentual de reprovação por falta: "+porcReprovaFalta()+"%");
    }
}
