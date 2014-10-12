/*
 Deseja-se fazer um levantamento a respeito da ausência de alunos à primeira prova de Programação de Computadores para
 cada uma das 14 turmas existentes. Para cada turma, é fornecido um conjunto de valores, sendo que os dois primeiros
 valores do conjunto correspondem à identificação da turma (A, ou B, ou C,...) e ao número de alunos matriculados, e os
 demais valores deste conjunto contêm o número de matrícula do aluno e a letra A ou P para caso de o aluno estar ausente ou
 presente, respectivamente. Fazer um algoritmo que:
 • Para cada turma, calcule a porcentagem de ausência e escreva a identificação da turma e a porcentagem calculada;
 • Determine e escreva quantas turmas tiveram porcentagem de ausência superior a 5%.
 */
package listalinguagem3.exercicio08;

import java.util.Scanner;

public class Exercicio8 {

    Scanner scanner = new Scanner(System.in);
    private String nomeTurma;
    private String matricAluno;
    private int quntAlunosMatric;
    private int presentes;
    private int ausentes;
    private double porcAusentes;
    private double turmasPorcAusentesMaior5Porc;

    public void porcAusenciaTurma() {
        this.porcAusentes = ((quntAlunosMatric - presentes) * 100) / quntAlunosMatric;
        if (this.porcAusentes > 5) {
            turmasPorcAusentesMaior5Porc++;
        }
    }

    public void PegaDados() {
        //boolean cadastroA = false, cadastroB = false, cadastroC = false, cadastroD = false, cadastroE = false, cadastroF = false, cadastroG = false, cadastroH = false, cadastroI = false, cadastroJ = false, cadastroK = false, cadastroL = false, cadastroM = false, cadastroN = false;
        String presenca;
        int quntTurmas = 14;
        while (quntTurmas > 0) {
            System.out.println("Informe uma turma entre A-N para realizar a chamada: ");
            this.nomeTurma = scanner.next();
//            if (!nomeTurma.equalsIgnoreCase("a") || !nomeTurma.equalsIgnoreCase("b")
//                    || !nomeTurma.equalsIgnoreCase("c") || !nomeTurma.equalsIgnoreCase("d")
//                    || !nomeTurma.equalsIgnoreCase("e") || !nomeTurma.equalsIgnoreCase("f")
//                    || !nomeTurma.equalsIgnoreCase("g") || !nomeTurma.equalsIgnoreCase("h")
//                    || !nomeTurma.equalsIgnoreCase("i") || !nomeTurma.equalsIgnoreCase("j")
//                    || !nomeTurma.equalsIgnoreCase("k") || !nomeTurma.equalsIgnoreCase("l")
//                    || !nomeTurma.equalsIgnoreCase("m") || !nomeTurma.equalsIgnoreCase("n")) {
//                System.out.println("Turma não existe!");
//                this.nomeTurma = null;
//                System.out.println("Informe uma turma entre A-N para realizar a chamada: ");
//                return;
//            } else if ((nomeTurma.equalsIgnoreCase("a") && cadastroA == true)
//                    || (nomeTurma.equalsIgnoreCase("b") && cadastroB == true)
//                    || (nomeTurma.equalsIgnoreCase("c") && cadastroC == true)
//                    || (nomeTurma.equalsIgnoreCase("d") && cadastroD == true)
//                    || (nomeTurma.equalsIgnoreCase("e") && cadastroE == true)
//                    || (nomeTurma.equalsIgnoreCase("f") && cadastroF == true)
//                    || (nomeTurma.equalsIgnoreCase("g") && cadastroG == true)
//                    || (nomeTurma.equalsIgnoreCase("h") && cadastroH == true)
//                    || (nomeTurma.equalsIgnoreCase("i") && cadastroI == true)
//                    || (nomeTurma.equalsIgnoreCase("j") && cadastroJ == true)
//                    || (nomeTurma.equalsIgnoreCase("k") && cadastroK == true)
//                    || (nomeTurma.equalsIgnoreCase("l") && cadastroL == true)
//                    || (nomeTurma.equalsIgnoreCase("m") && cadastroM == true)
//                    || (nomeTurma.equalsIgnoreCase("n") && cadastroN == true)) {
//                System.out.println("Na turma "+nomeTurma+" ja foi feita a chamada");
//                this.nomeTurma = null;
//                return;
//            } else {
                System.out.println("Informe a quantidade de alunos matriculados nesta turma: ");
                this.quntAlunosMatric = scanner.nextInt();
                int contALunos = quntAlunosMatric;
                while (contALunos > 0) {
                    System.out.println("Informa a matricula do aluno");
                    this.matricAluno = scanner.next();
                    System.out.println("(P)Presente ou (A)Ausente ?");
                    presenca = scanner.next();
                    if (presenca.equalsIgnoreCase("p")) {
                        this.presentes++;
                    } else if (presenca.equalsIgnoreCase("a")) {
                        this.ausentes++;
                    }
                    contALunos--;
                }
                if (nomeTurma.equalsIgnoreCase("a")) {
                    porcAusenciaTurma();
                    setTurmaA(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroA = true;
                } else if (nomeTurma.equalsIgnoreCase("b")) {
                    porcAusenciaTurma();
                    setTurmaB(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                } else if (nomeTurma.equalsIgnoreCase("c")) {
                    porcAusenciaTurma();
                    setTurmaC(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroC = true;
                } else if (nomeTurma.equalsIgnoreCase("D")) {
                    porcAusenciaTurma();
                    setTurmaD(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroD = true;
                } else if (nomeTurma.equalsIgnoreCase("e")) {
                    porcAusenciaTurma();
                    setTurmaE(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroE = true;
                } else if (nomeTurma.equalsIgnoreCase("f")) {
                    porcAusenciaTurma();
                    setTurmaF(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroF = true;
                } else if (nomeTurma.equalsIgnoreCase("g")) {
                    porcAusenciaTurma();
                    setTurmaG(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroG = true;
                } else if (nomeTurma.equalsIgnoreCase("h")) {
                    porcAusenciaTurma();
                    setTurmaH(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroH = true;
                } else if (nomeTurma.equalsIgnoreCase("i")) {
                    porcAusenciaTurma();
                    setTurmaI(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroI = true;
                } else if (nomeTurma.equalsIgnoreCase("j")) {
                    porcAusenciaTurma();
                    setTurmaJ(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroJ = true;
                } else if (nomeTurma.equalsIgnoreCase("k")) {
                    porcAusenciaTurma();
                    setTurmaK(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroK = true;
                } else if (nomeTurma.equalsIgnoreCase("l")) {
                    porcAusenciaTurma();
                    setTurmaL(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroL = true;
                } else if (nomeTurma.equalsIgnoreCase("m")) {
                    porcAusenciaTurma();
                    setTurmaM(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroM = true;
                } else if (nomeTurma.equalsIgnoreCase("n")) {
                    porcAusenciaTurma();
                    setTurmaN(nomeTurma, quntAlunosMatric, presentes, ausentes, porcAusentes);
                    //cadastroN = true;
                }
                this.nomeTurma = null;
                this.matricAluno = null;
                this.quntAlunosMatric = 0;
                this.presentes = 0;
                this.ausentes = 0;
                this.porcAusentes = 0.0;
                quntTurmas--;
            //}
        }
        imprimiDados();
    }

    private double porcentagemAusentesA;
    public void setTurmaA(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesA = porcAusentes;
    }
    
    private double porcentagemAusentesB;
    public void setTurmaB(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesB = porcAusentes;
    }
    
    private double porcentagemAusentesC;
    public void setTurmaC(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesC = porcAusentes;
    }
    
    private double porcentagemAusentesD;
    public void setTurmaD(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesD = porcAusentes;
    }
    
    private double porcentagemAusentesE;
    public void setTurmaE(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesE = porcAusentes;
    }
    
    private double porcentagemAusentesF;
    public void setTurmaF(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesF = porcAusentes;
    }
    
    private double porcentagemAusentesG;
    public void setTurmaG(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesG = porcAusentes;
    }
    
    private double porcentagemAusentesH;
    public void setTurmaH(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesH = porcAusentes;
    }
    
    private double porcentagemAusentesI;
    public void setTurmaI(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesI = porcAusentes;
    }
    
    private double porcentagemAusentesJ;
    public void setTurmaJ(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesJ = porcAusentes;
    }
    
    private double porcentagemAusentesK;
    public void setTurmaK(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesK = porcAusentes;
    }
    
    private double porcentagemAusentesL;
    public void setTurmaL(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesL = porcAusentes;
    }
    
    private double porcentagemAusentesM;
    public void setTurmaM(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesM = porcAusentes;
    }
    
    private double porcentagemAusentesN;
    public void setTurmaN(String nomeTurma, int contALunos, int presentes, int ausentes, double porcAusentes) {
        String turma = nomeTurma;
        int quntAlunos = contALunos;
        int quntPresentes = presentes;
        int quntAusentes = ausentes;
        this.porcentagemAusentesN = porcAusentes;
    }

    public double getPorcentagemAusentesA() {
        return porcentagemAusentesA;
    }

    public double getPorcentagemAusentesB() {
        return porcentagemAusentesB;
    }

    public double getPorcentagemAusentesC() {
        return porcentagemAusentesC;
    }

    public double getPorcentagemAusentesD() {
        return porcentagemAusentesD;
    }

    public double getPorcentagemAusentesE() {
        return porcentagemAusentesE;
    }

    public double getPorcentagemAusentesF() {
        return porcentagemAusentesF;
    }

    public double getPorcentagemAusentesG() {
        return porcentagemAusentesG;
    }

    public double getPorcentagemAusentesH() {
        return porcentagemAusentesH;
    }

    public double getPorcentagemAusentesI() {
        return porcentagemAusentesI;
    }

    public double getPorcentagemAusentesJ() {
        return porcentagemAusentesJ;
    }

    public double getPorcentagemAusentesK() {
        return porcentagemAusentesK;
    }

    public double getPorcentagemAusentesL() {
        return porcentagemAusentesL;
    }

    public double getPorcentagemAusentesM() {
        return porcentagemAusentesM;
    }

    public double getPorcentagemAusentesN() {
        return porcentagemAusentesN;
    }

    public void imprimiDados(){
        System.out.println("Turma A "+getPorcentagemAusentesA()+"% de faltas");
        System.out.println("Turma B "+getPorcentagemAusentesB()+"% de faltas");
        System.out.println("Turma C "+getPorcentagemAusentesC()+"% de faltas");
        System.out.println("Turma D "+getPorcentagemAusentesD()+"% de faltas");
        System.out.println("Turma E "+getPorcentagemAusentesE()+"% de faltas");
        System.out.println("Turma F "+getPorcentagemAusentesF()+"% de faltas");
        System.out.println("Turma G "+getPorcentagemAusentesG()+"% de faltas");
        System.out.println("Turma H "+getPorcentagemAusentesI()+"% de faltas");
        System.out.println("Turma I "+getPorcentagemAusentesH()+"% de faltas");
        System.out.println("Turma J "+getPorcentagemAusentesJ()+"% de faltas");
        System.out.println("Turma K "+getPorcentagemAusentesK()+"% de faltas");
        System.out.println("Turma L "+getPorcentagemAusentesL()+"% de faltas");
        System.out.println("Turma M "+getPorcentagemAusentesM()+"% de faltas");
        System.out.println("Turma N "+getPorcentagemAusentesN()+"% de faltas");
        System.out.println(turmasPorcAusentesMaior5Porc+" turmas tiveram o percentual de ausencia acima de 5%");
    }
}
