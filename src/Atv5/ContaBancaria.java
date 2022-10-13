package Atv5;

public class ContaBancaria {
    private Double saldo = 0.0;
    private int tipo;
    private String senha;
    private boolean status;
    private Cliente cliente;

    public ContaBancaria(int tipo, String senha, Cliente cliente) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.status = true;
        this.senha = senha;
    }

    public void aplicarBonus(double percentage) {
        this.saldo += this.saldo * (percentage / 100.00);
    }

    public void aplicarBonus() {
        this.saldo += this.saldo * (5.0 / 100.00);
    }

    public void closeAccount() {
        if (this.saldo > 0) {
            System.out.println("Ainda existe dinheiro na conta. Para fechar a conta deposite todo seu saldo!");
        } else {
            System.out.println("Conta fechada!");
        }
    }

    public void deposit(Double amount) {
        this.saldo += amount;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void withdraw(Double amount) throws SaldoInsuficienteException {

        if (this.saldo < amount) {
            throw new SaldoInsuficienteException("Saldo insuficiente", null);
        } else {
            this.saldo -= amount;
        }
    }

    public Double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [saldo=" + saldo + ", tipo=" + tipo + ", senha=" + senha + ", status=" + status
                + ", senha="
                + senha + "]";
    }

}
