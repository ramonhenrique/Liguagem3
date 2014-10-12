/*
Supondo que a população de uma cidade A seja da ordem de 90.000 habitantes com uma taxa anual de crescimento de 3% e
que a população de uma cidade B seja. aproximadamente, de 200.000 habitantes com uma taxa anual de crescimento de
1.5%, fazer um algoritmo que calcule e escreva o número de anos necessários para que a população da cidade A ultrapasse ou
igual a população da cidade B, mantidas essas taxas de crescimento.
 */
package listalinguagem3.exercicio04;

public class Exercicio4 {
    private double habCidA=90000;
    private double habCidB=200000;
    private double taxaCrescCidA=0.03;
    private double taxaCrescCidB=0.015;

    public void setHabCidA(double novaPopuA) {
        this.habCidA += novaPopuA;
    }

    public void setHabCidB(double novaPopuB) {
        this.habCidB += novaPopuB;
    }

    public double getHabCidA() {
        return habCidA;
    }

    public double getHabCidB() {
        return habCidB;
    }
    
    public void lerDados(){
        double novaPopuA,novaPopuB;
        int contAnos=0;
        while(habCidA<habCidB){
            novaPopuA=habCidA*taxaCrescCidA;
            setHabCidA(novaPopuA);
            novaPopuB=habCidB*taxaCrescCidB;
            setHabCidB(novaPopuB);
            contAnos++;
        }
        System.out.println("Em "+contAnos+" anos, a cidade A com "+getHabCidA()+" habitantes, ultrapassou em nivel populacional a cidade B que esta atualmente com "+getHabCidB());
        
    }
    
}
