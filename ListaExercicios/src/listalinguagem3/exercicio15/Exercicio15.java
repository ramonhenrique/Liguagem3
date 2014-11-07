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
    Cliente informConta[] = new Cliente[5];
    private static int taxa = 5;
    private double valor;

    public void setTaxa(int conta) {
        for (int i = 0; i < informConta.length; i++) {
            if (informConta[i].getNumConta() == conta) {
                double minimo = informConta[i].getSaldoCdia() / 2;
                informConta[i].setSaldoMinConta(minimo);
                if (informConta[i].getSaldoFdia() < informConta[i].getSaldoMinConta()) {
                    double atual = informConta[i].getSaldoAtual() - this.taxa;
                    informConta[i].setSaldoAtual(atual);
                }
            }
        }
    }

    public void saque() {
        int conta, transacao;
        double saldo;
        double valor;
        boolean existe = false;
        System.out.println("|-----------------------------------------------|");
        System.out.println("|----------------------SAQUE--------------------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("Conta:");
        conta = s.nextInt();
        for (int i = 0; i < informConta.length; i++) {
            if (informConta[i].getNumConta() == conta) {
                existe = true;
                if (informConta[i].getSaldoAtual() > 0) {
                    saldo = informConta[i].getSaldoAtual();
                    System.out.println("valor do saque:");
                    valor = s.nextDouble();
                    if (saldo < valor) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo = informConta[i].getSaldoAtual() - valor;
                        informConta[i].setSaldoAtual(saldo);
                        transacao = informConta[i].getSaque() + 1;
                        informConta[i].setSaque(transacao);
                    }
                } else if (informConta[i].getSaldoAtual() < 0) {
                    System.out.println("Sem saldo");
                }
                setTaxa(conta);
                break;
            }
        }
        if (!existe) {
            System.out.println("Conta não encontrada");
        }
    }

    public void deposito() {
        int conta, transacao;
        double saldo;
        double valor;
        boolean existe = false;
        System.out.println("|-----------------------------------------------|");
        System.out.println("|--------------------DEPOSTIO-------------------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("Conta:");
        conta = s.nextInt();
        for (int i = 0; i < informConta.length; i++) {
            if (informConta[i].getNumConta() == conta) {
                existe = true;
                System.out.println("valor do depósito:");
                valor = s.nextDouble();
                saldo = informConta[i].getSaldoAtual() + valor;
                informConta[i].setSaldoAtual(saldo);
                transacao = informConta[i].getDeposito() + 1;
                informConta[i].setDeposito(transacao);
                break;
            }
            setTaxa(conta);
        }
        if (!existe) {
            System.out.println("Conta não encontrada");
        }
    }

    public void extrato() {
        int conta;
        double saldo;
        boolean existe = false;
        System.out.println("|-----------------------------------------------|");
        System.out.println("|--------------------EXTRATO--------------------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("Conta:");
        conta = s.nextInt();
        for (int i = 0; i < informConta.length; i++) {
            if (informConta[i].getNumConta() == conta) {
                existe = true;
                System.out.println("Saldo:" + informConta[i].getSaldoAtual());
                break;
            }
            setTaxa(conta);
        }
        if (!existe) {
            System.out.println("Conta não encontrada");
        }
    }

    public void setSaldoMinimo(int conta) {
        for (int i = 0; i < informConta.length; i++) {
            if (informConta[i].getNumConta() == conta) {
                double minimo = informConta[i].getSaldoCdia() / 2;
                informConta[i].setSaldoMinConta(minimo);
                break;
            }
        }
    }

    public void cadastraConta() {
        int numConta = 1;
        double saldoAtual;
        System.out.println("|-----------------------------------------------|");
        System.out.println("|-------------------CADASTRO--------------------|");
        System.out.println("|-----------------------------------------------|");
        for (int i = 0; i < informConta.length; i++) {
            informConta[i] = new Cliente();
            System.out.println("Número da conta:");
            numConta = s.nextInt();
            if (numConta > 0) {
                informConta[i].setNumConta(numConta);
                System.out.println("Saldo:");
                saldoAtual = s.nextDouble();
                informConta[i].setSaldoAtual(saldoAtual);
                informConta[i].setSaldoCdia(saldoAtual);
                setSaldoMinimo(numConta);
            } else {
                break;
            }
        }
    }

    public void resumoDiario() {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|--------------------RESUMO---------------------|");
        System.out.println("|-----------------------------------------------|");
        for (int i = 0; i < informConta.length; i++) {
            System.out.println("Conta:" + informConta[i].getNumConta());
            if (informConta[i].getSaldoAtual() <= 0) {
                System.out.println("NÃO HÁ FUNDOS");
            } else if (informConta[i].getNumConta() != 0) {
                System.out.println("Saldo:" + informConta[i].getSaldoAtual());
                System.out.println("Quantidade de saques:" + informConta[i].getSaque());
                System.out.println("Quantidade de depositos:" + informConta[i].getDeposito());
                System.out.println("|-----------------------------------------------|");
            }
        }
    }

    public void tela() {
        String flag = "";
        int num;
        while (!flag.equalsIgnoreCase("sair")) {
            System.out.println("|------------------------|");
            System.out.println("|-------DALLAS-BANK------|");
            System.out.println("|------------------------|");
            System.out.println("|---------CLIENTE--------|");
            System.out.println("|SAQUE                (1)|");
            System.out.println("|DEPOSITO             (2)|");
            System.out.println("|EXTRATO              (3)|");
            System.out.println("|-------FUNCIONÁRIO------|");
            System.out.println("|Cadastrar nova conta (4)|");
            System.out.println("|Resumo Diário        (5)|");
            System.out.println("|Exit                 (6)|");
            System.out.println("|------------------------|");
            num = s.nextInt();
            switch (num) {
                case 1: {
                    saque();
                    break;
                }
                case 2: {
                    deposito();
                    break;
                }
                case 3: {
                    extrato();
                    break;
                }
                case 4: {
                    cadastraConta();
                    break;
                }
                case 5: {
                    resumoDiario();
                    break;
                }
                case 6: {
                    flag = "sair";
                    break;
                }
            }
        }
    }

}
