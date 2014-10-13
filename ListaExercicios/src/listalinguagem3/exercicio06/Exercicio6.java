/*
 Uma companhia de teatro planeja dar uma série de espetáculos. A direção calcula que, a R$ 5,00 o ingresso, serão vendidos 120
 ingressos, e as despesas montarão em R$ 200,00. A uma diminuição de R$ 0,50 no preço dos ingressos espera-se que haja um
 aumento de 26 ingressos vendidos.
 Fazer um algoritmo que escreva uma tabela de valores do lucro esperado em função do preço do ingresso, fazendo-se variar
 este preço de R$ 5,00 a R$ 1,00 de R$ 0,50 em R$ 0,50. Escreva, ainda, o lucro máximo esperado, o preço e o número de
 ingressos correspondentes.
 */
package listalinguagem3.exercicio06;

public class Exercicio6 {

    private double valorIngresso = 5;
    private double despesas = 2000;
    private double descrementoValor = 0.5;
    private int quntIngressos = 120;
    private int maisIngressos = 26;
    private double lucroMaximo;

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setDecrementValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public int getQuntIngressos() {
        return quntIngressos;
    }

    public void setQuntIngressos(int quntIngressos) {
        this.quntIngressos += quntIngressos;
    }
    
    public void calculaLucro() {
        while (this.valorIngresso >= 1) {
            lucroMaximo = quntIngressos * valorIngresso;
            imprimiValores();
            setDecrementValorIngresso(valorIngresso - descrementoValor);
            setQuntIngressos(maisIngressos);
        }
    }

    public void imprimiValores() {
        System.out.println(" Lucro esperado: " + lucroMaximo + " Preço unitário " + getValorIngresso() + " Quantidade: " + getQuntIngressos());
    }
}
