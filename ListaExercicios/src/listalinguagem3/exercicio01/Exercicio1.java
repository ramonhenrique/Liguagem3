/*
A conversão de grau Farenheit para Celsius é obtida por C = 5/9(F-32)
Fazer um algoritmo que calcule e escreva uma tabela de Celsius em função de graus Farenheit, que variam de 50
a 150 de 1 em 1.
 */
package listalinguagem3.exercicio01;

public class Exercicio1 {
    private double farenheit;
    private double Resultado;

    public Exercicio1(double far) {
        this.farenheit = far;
    }

    public Exercicio1() {
        this.farenheit = 0;
    }

    public void setFarenheit(double far) {
        this.farenheit = far;
    }

    public double getFarenheit() {
        return this.farenheit;
    }

    public double converte() {

        Resultado = (5.0 / 9.0) * (this.farenheit - 32);
        return Resultado;
    }

    public void Incremento() {
        this.farenheit++;
    }
    
    public void converter(){
        for(;getFarenheit() <=150;Incremento()){
            System.out.println(converte());
        }
    } 
}
