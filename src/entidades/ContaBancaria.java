package entidades;

public class ContaBancaria {

    private double saldo;
    private String conta;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        if (valor < 1) {
            System.out.println("Saldo insuficiente");
            //throw new IllegalArgumentException("O valor deve ser maior que um real");
        }
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }
    public void transferir(Double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            //throw new IllegalArgumentException("Saldo Insuficente");

        }else {
            this.saldo -= valor;
        }
    }
    public void sacar(Double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            //throw new IllegalArgumentException("Saldo Insuficente");
        }else {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
