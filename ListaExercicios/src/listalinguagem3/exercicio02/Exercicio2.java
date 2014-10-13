/*
Fazer um algoritmo que:
Leia um número indeterminado de linhas contendo cada uma a idade de um indivíduo. A última linha, que não entrará nos
cálculos, contém o valor da idade igual a zero.
Calcule escreva a idade média deste grupo de indivíduos.
 */

package listalinguagem3.exercicio02;

import java.util.Scanner;

public class Exercicio2 {
    Scanner scanner = new Scanner(System.in);
    private double mediaIdade;
    private int cont;
    private int idadePessoas;
    private int quantidadePessoas;
    private int somaIdades;

    public Exercicio2(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas-1;
        cont = quantidadePessoas;
    }

    public void setIdadePessoas(int idadePessoas) {
        this.idadePessoas = idadePessoas;
        this.somaIdades+=this.idadePessoas;
    }
    
    public void mediaIdade() {
        mediaIdade = (somaIdades/quantidadePessoas);
        System.out.println("A media de idades desse grupo de pessoas é: "+mediaIdade);
    }
    
    public void lerIdades(){
        int idade;
        while(cont>1){
            System.out.println("Digite a idade: ");
            idade=scanner.nextInt();
            setIdadePessoas(idade);
            cont--;
        }
        mediaIdade();
    }
}
