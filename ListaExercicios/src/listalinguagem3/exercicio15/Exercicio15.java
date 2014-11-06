/*
 Os bancos atualizam diariamente as contas de seus clientes. Essa atualização envolve a análise dos depósitos e retiradas de
 cada conta. Numa conta de saldo mínimo, uma taxa de serviço é deduzida se a conta cai abaixo de uma certa quantia
 especificada. 
 Suponha que uma conta particular comece o dia com um saldo de R$ 60,00. O saldo mínimo exigido é R$ 30,00 e
 se o saldo de fim de dia for menor do que isso, uma taxa é reduzida da conta. A fim de que essa atualização fosse feita
 utilizando computador, é fornecido, para cada conta, o seguinte conjunto de dados:
 A primeira linha contém o número da conta, o valor do saldo atual e do saldo mínimo diário, quantidade de transações e taxa
 de serviço. Utilize o número da conta = 0 como Flag.
 As linhas seguintes contêm o valor e o código da transação (depósito ou retirada) para cada conta lida no item acima. Utilize o
 código da transação = “Fim” como Flag.
 Escrever um algoritmo que:
 • Calcule o saldo (saldo/débito) da conta ao fim do dia (se o resultado estiver abaixo do saldo mínimo, isto significa
 insuficiência de fundos na conta).
 • Escreva para cada conta, o seu número e o saldo calculado. Se não houver fundos, imprima o numero da conta e a
 mensagem "NÃO HÁ FUNDOS".
 */
package listalinguagem3.exercicio15;

import java.util.Scanner;
import listalinguagem3.exercicio15.Cliente;

public class Exercicio15 extends Cliente {
    Scanner s = new Scanner(System.in);
    Cliente dados = new Cliente();
    private static int taxa=5;
    private double valor;
    private String situacao = "Sem saldos";
    
    public void setTaxa() {
        double minimo = dados.getSaldoCdia()/2;
        dados.setSaldoMinConta(minimo);
        if (dados.getSaldoFdia() < dados.getSaldoMinConta()){
            double atual = dados.getSaldoAtual() - this.taxa;
            dados.setSaldoAtual(atual);
        }
    }
    
    public void leitura(){
        int conta=1;
        while (conta>0){
            
        }
    }

}
