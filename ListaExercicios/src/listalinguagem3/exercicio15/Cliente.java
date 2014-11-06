package listalinguagem3.exercicio15;

public class Cliente {
    private int numConta;
    private double saldoAtual;
    private double saldoMinConta;
    private double saldoCdia;
    private double saldoFdia;
    private int deposito;
    private int saque;

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getSaque() {
        return saque;
    }

    public void setSaque(int saque) {
        this.saque = saque;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getSaldoMinConta() {
        return saldoMinConta;
    }

    public void setSaldoMinConta(double saldoMinConta) {
        this.saldoMinConta = saldoMinConta;
    }

    public double getSaldoCdia() {
        return saldoCdia;
    }

    public void setSaldoCdia(double saldoCdia) {
        this.saldoCdia = saldoCdia;
    }

    public double getSaldoFdia() {
        return saldoFdia;
    }

    public void setSaldoFdia(double saldoFdia) {
        this.saldoFdia = saldoFdia;
    }
}
