/*
 Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar uma
 linha para cada mercadoria com o nome, preço de compra e preço de venda da das mesmas. Fazer um algoritmo que:
 Determine e escreva quantas mercadorias proporcionam:
 Lucro < 10%
 10% < = lucro < = 20%
 Lucro > 20%
 • Determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
 Observação: o aluno deve adotar um flag.
 */
package listalinguagem3.exercicio07;

import java.util.Scanner;

public class Exercicio7 {

    Scanner scanner = new Scanner(System.in);
    private String nome;
    private double precCompra;
    private double precVenda;
    private int quntMercLucroBaixo10Porc = 0;
    private int quntMercLucroMaior10Menor20Porc = 0;
    private int quntMercLucroMaior20Porc = 0;
    private double valorTotalCompra;
    private double valorTotalVenda;
    private double LucroTotal;
    private double lucroMercadoria;

    public void setPrecCompra(double precCompra) {
        this.precCompra = precCompra;
    }

    public void setPrecVenda(double precVenda) {
        this.precVenda = precVenda;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra += valorTotalCompra;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda += valorTotalVenda;
    }

    public void lucroMercadoria() {
        lucroMercadoria = ((precVenda - precCompra) * 100) / precCompra;
    }

    public double lucroTotal() {
        double lucroTotal;
        lucroTotal = valorTotalVenda - valorTotalCompra;
        return lucroTotal;
    }

    public void lerDados() {
        String flag;
        System.out.println("Digite 'x' para sair ou qualquer tecla cadatrar mercadorias");
        flag = scanner.next();
        while (!flag.equalsIgnoreCase("x")) {
            System.out.println("Digite o nome da mercadoria: ");
            this.nome = scanner.next();
            System.out.println("Digite o preço de compra do " + this.nome);
            precCompra = scanner.nextDouble();
            setPrecCompra(precCompra);
            setValorTotalCompra(precCompra);
            System.out.println("Digite o preço de venda do " + this.nome);
            precVenda = scanner.nextDouble();
            setPrecVenda(precVenda);
            setValorTotalVenda(precVenda);
            lucroMercadoria();
            if (lucroMercadoria < 10) {
                quntMercLucroBaixo10Porc++;
            } else if (lucroMercadoria >= 10 && lucroMercadoria <= 20) {
                quntMercLucroMaior10Menor20Porc++;
            } else if (lucroMercadoria > 20) {
                quntMercLucroMaior20Porc++;
            }
            System.out.println("Digite 'x' para sair ou qualquer tecla cadatrar mercadorias");
            flag = scanner.next();
        }
        imprimiDados();
    }
    
    public void imprimiDados(){
        System.out.println(quntMercLucroBaixo10Porc+" Mercadorias tiveram lucro abaixo de 10%");
        System.out.println(quntMercLucroMaior10Menor20Porc+" Mercadorias tiveram lucro entre 10% e 20%");
        System.out.println(quntMercLucroMaior20Porc+" Mercadorias tiveram lucro acima de 20%");
        System.out.println("Valor total de compra: "+valorTotalCompra);
        System.out.println("Valor total de venda: "+valorTotalVenda);
        System.out.println("Lucro total obtido: "+lucroTotal());
    }
}
