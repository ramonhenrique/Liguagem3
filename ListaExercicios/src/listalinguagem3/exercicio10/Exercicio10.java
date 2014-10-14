/*
 Foi feita uma pesquisa para determinar o índice de mortalidade infantil em um certo período. Fazer um algoritmo que:
    • Leia inicialmente o número de crianças nascidas no período;
    • Leia, em seguida, um número indeterminado de linhas, contendo, cada uma, o sexo de uma criança morta (masculino,
feminino) e o número de meses de vida da criança. A ultima linha, que não entrará nos cálculos, contém no lugar do sexo
a palavra "vazio";
    • Determine e imprima;
    a) A porcentagem de crianças mortas no período;
    b) A porcentagem de crianças do sexo masculino mortas no período;
    c) A porcentagem de crianças que viveram 24 meses ou menos no período.
 */
package listalinguagem3.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    Scanner scanner = new Scanner(System.in);
    private int contCriancaN=0;
    private int contCriancaM=0;
    private int CH=0;
    private int tempoVidaCrianca;
    private double porcCriancaMorta;
    private double porcCriancaHMorta;
    private double porcCriancaViveAte2ano;
    private int viveuAte24Meses=0;

    public void setTempoVidaCrianca(int tempoVidaCrianca) {
        this.tempoVidaCrianca = tempoVidaCrianca;
        if (tempoVidaCrianca<=24)
            this.viveuAte24Meses++;
    }

    public Exercicio10(int contCriancaN) {
        this.contCriancaN = contCriancaN;
    }

    public double getPorcCriancaMorta() {
        return porcCriancaMorta;
    }

    public void setPorcCriancaMorta() {
        this.porcCriancaMorta = (contCriancaM*100)/contCriancaN;
    }

    public double getPorcCriancaHMorta() {
        return porcCriancaHMorta;
    }

    public void setPorcCriancaHMorta() {
        this.porcCriancaHMorta = (CH*100)/contCriancaN;
    }

    public double getPorcCriancaViveAte2ano() {
        return porcCriancaViveAte2ano;
    }

    public void setPorcCriancaViveAte2ano() {
        this.porcCriancaViveAte2ano = ((viveuAte24Meses*100)/contCriancaN);
    }
    
    public void pesquisaMortalidade(){
        String flag="";
        String sexoCrianca;
        int tempo;
        while (!flag.equalsIgnoreCase("vazio")){
            System.out.println("Informe o sexo da criança:");
            sexoCrianca=scanner.next();
            contCriancaM++;
            if(sexoCrianca.equalsIgnoreCase("m"))
                CH++;            
            System.out.println("Informe o tempo de vida da crianca em meses: ");
            tempo=scanner.nextInt();
            setTempoVidaCrianca(tempo);
            System.out.println("Digite vazio para sair ou qualquer letra para continuar: ");
            flag=scanner.next();
        }
        setPorcCriancaMorta();
        setPorcCriancaHMorta();
        setPorcCriancaViveAte2ano();
        imprimeDados();
    }
    
    public void imprimeDados(){
        System.out.println("porcentagem de crianças mortas"+getPorcCriancaMorta()+"%");
        System.out.println("porcentagem de crianças do sexo masculino mortas"+getPorcCriancaHMorta()+"%");
        System.out.println("porcentagem de crianças que viveram 24 meses ou menos"+getPorcCriancaViveAte2ano()+"%");
    }
}
