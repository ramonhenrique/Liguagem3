/*
 Foi feita uma pesquisa de audiência de canal de TV em várias casas de uma certa cidade, num determinado dia. Para cada casa
 visitada, é fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que o estavam assistindo naquela casa. Se a
 televisão estivesse desligada, nada era anotado, ou seja, esta casa não entrava na pesquisa. Fazer um algoritmo que:
 • Leia um número indeterminado de dados, sendo que o "FLAG" corresponde ao número do canal igual a zero;
 • Calcule a percentagem de audiência para cada emissora;
 • Escreva o número do canal e a sua respectiva porcentagem.
 */
package listalinguagem3.exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    Scanner s = new Scanner(System.in);
    private int quantPessoasCanal4;
    private int quantPessoasCanal5;
    private int quantPessoasCanal7;
    private int quantPessoasCanal12;
    private int quantCasasVisitadas = 0;
    private int quntTotalPessoas;
    private int casasTvDesligadas;

    public void contAudCanal(int canal, int contPessoasCasa) {
        switch (canal) {
            case 4:
                this.quantPessoasCanal4 += contPessoasCasa;
                this.quntTotalPessoas += contPessoasCasa;
                break;
            case 5:
                this.quantPessoasCanal5 += contPessoasCasa;
                this.quntTotalPessoas += contPessoasCasa;
                break;
            case 7:
                this.quantPessoasCanal7 += contPessoasCasa;
                this.quntTotalPessoas += contPessoasCasa;
                break;
            case 12:
                this.quantPessoasCanal12 += contPessoasCasa;
                this.quntTotalPessoas += contPessoasCasa;
                break;
            case 0:
                System.out.println("Fim da pesquisa!!!");
                break;
        }
    }

    public void imprimiDados() {
        double percCanal4 = ((this.quantPessoasCanal4 * 100) / quntTotalPessoas);
        System.out.println("Canal 4: " + percCanal4 + "% de audiência");
        double percCanal5 = ((this.quantPessoasCanal5 * 100) / quntTotalPessoas);
        System.out.println("Canal 5: " + percCanal5 + "% de audiência");
        double percCanal7 = ((this.quantPessoasCanal7 * 100) / quntTotalPessoas);
        System.out.println("Canal 7: " + percCanal7 + "% de audiência");
        double percCanal12 = ((this.quantPessoasCanal12 * 100) / quntTotalPessoas);
        System.out.println("Canal 12: " + percCanal12 + "% de audiência");
        System.out.println("Em " + quantCasasVisitadas + " casas visitadas, " + casasTvDesligadas + " estavam com a tv deslidada, num total de " + quntTotalPessoas + " pessoas foram entrevistdas");
    }

    public void quntCasa() {
        this.quantCasasVisitadas++;
    }

    public void lerDados() {
        int canal = 1;
        int contPessoasCasa;
        String tv;
        while (canal != 0) {
            System.out.println("A tv esta ligada?");
            tv = s.next();
            if (tv.equalsIgnoreCase("sim")) {
                System.out.println("Canal sendo assistido na casa: ");
                canal = s.nextInt();
                if (canal != 0) {
                    System.out.println("Quasntas pessoas assistindo o canal " + canal + ": ");
                    contPessoasCasa = s.nextInt();
                    contAudCanal(canal, contPessoasCasa);
                    quntCasa();
                } else if (canal == 0) {
                    contPessoasCasa = 0;
                    contAudCanal(canal, contPessoasCasa);
                }
            } else {
                this.casasTvDesligadas++;
                quntCasa();
            }
        }
        imprimiDados();
    }
}
