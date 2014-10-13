/*
 Um determinado material radioativo perde a metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, fazer
 um algoritmo que determine o tempo necessário para que essa massa se torne menor do que 0,5 grama. Escreva a massa
 inicial, a massa final e o tempo calculado em horas, minutos e segundos.
 */
package listalinguagem3.exercicio05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio5 {

    private String nomeMaterial;
    private double massa;
    private double massaInicial;
    private double massafinal;
    private double tempoDecrementoMassa = 50;
    private int cont=0;
    private double tempoHoras;
    private double tempoMinutos;
    private double tempoSegundos;
    
    public Exercicio5(String nomeMaterial, double massa) {
        this.nomeMaterial = nomeMaterial;
        this.massa = massa;
        this.massaInicial=massa;
    }
    
    public void time(){
        this.tempoDecrementoMassa--;
        cont++;
    }

    public void perdeMassa(){
        while (massa>=0.5){
            if (tempoDecrementoMassa==0){
                massa=massa/2;
                tempoDecrementoMassa=50;
            }
            time();
        }
        massafinal=massa;
        tempoSegundos=cont;
        tempoMinutos=tempoSegundos/60;
        tempoHoras=tempoMinutos/60;
        imprimiDados();
    }
    
    public void imprimiDados(){
        System.out.println("A massa inicial é "+massaInicial);
        System.out.println("A massa final é "+massafinal);
        System.out.println("Levou "+tempoHoras+" Horas "+tempoMinutos+" Minutos e "+tempoSegundos+" Segundos para a massa ficar com o peso abaixo de 0,5 gramas");
    }
}
