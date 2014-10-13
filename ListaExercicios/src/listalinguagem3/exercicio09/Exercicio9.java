/*
 Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado no
mercado. Para isso, forneceu o sexo do entrevistado e sua resposta (sim ou não). Sabendo-se que foram entrevistadas 2.000
pessoas, fazer um algoritmo que calcule e escreva:
    • O número de pessoas que responderam sim;
    • O número de pessoas que responderam não;
    • A porcentagem de pessoas do sexo feminino que responderam sim;
    • A porcentagem de pessoas do sexo masculino que responderam não.
 */
package listalinguagem3.exercicio09;

import java.util.Scanner;

public class Exercicio9 {
    Scanner scanner = new Scanner(System.in);
    private String sexo;
    private String resposta;
    private int quntHomensNao;
    private double porctHomensNao;
    private int quntMulheresSim;
    private double porctMulheresSim;
    private int quntPessoasSim;
    private int quntPessoasNao;
    private int quntEntrevistados=10;
    private int contH=0;
    private int contM=0;

    public int getQuntHomensNao() {
        return quntHomensNao;
    }

    public void setQuntHomensNao() {
        this.quntHomensNao++;
    }

    public int getQuntMulheresSim() {
        return quntMulheresSim;
    }

    public void setQuntMulheresSim() {
        this.quntMulheresSim++;
    }

    public int getQuntPessoasSim() {
        return quntPessoasSim;
    }

    public void setQuntPessoasSim() {
        this.quntPessoasSim++;
    }

    public int getQuntPessoasNao() {
        return quntPessoasNao;
    }

    public void setQuntPessoasNao() {
        this.quntPessoasNao++;
    }
    
    public double porctMulheresSim(){
        porctMulheresSim=((quntMulheresSim)*100)/contM;
        return porctMulheresSim;
    }
    
    public double porctHomensNao(){
        porctHomensNao=((quntHomensNao)*100)/contH;
        return porctHomensNao;
    }
    
    
    public void Pesquisa(){
        while(quntEntrevistados>0){
            System.out.println("Sexo: (M) ou (F) ?");
            sexo=scanner.next();
            if(sexo.equalsIgnoreCase("m")){
                contH++;
                System.out.println("Resposta: (Sim) ou (Não) ? ");
                resposta=scanner.next();
                if(resposta.equalsIgnoreCase("sim")){
                    setQuntPessoasSim();
                }
                else{
                    setQuntPessoasNao();
                    setQuntHomensNao();
                }
            }
            else if (sexo.equalsIgnoreCase("f")) {
                contM++;
                System.out.println("Resposta: (Sim) ou (Não) ? ");
                resposta=scanner.next();
                if(resposta.equalsIgnoreCase("sim")){
                    setQuntPessoasSim();
                    setQuntMulheresSim();
                }
                else{
                    setQuntPessoasNao();
                }
            }
            quntEntrevistados--;
        }
        imprimiDados();
    }
    
    public void imprimiDados(){
        System.out.println("Total de pessas que responderam sim: "+getQuntPessoasSim()+" pessoas");
        System.out.println("Total de pessas que responderam não: "+getQuntPessoasNao()+" pessoas");
        System.out.println("Percentual de mulheres que responderam sim: "+porctMulheresSim()+"%");
        System.out.println("precentual de homens que responderam não: "+porctHomensNao()+"%");
    }
    
}
