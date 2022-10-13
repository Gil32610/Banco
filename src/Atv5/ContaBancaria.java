package Atv5;

public class ContaBancaria extends Cliente {
    private Double saldo = 0.0;
    private String tipo;
    private String senha;
    private boolean status;

    public ContaBancaria(String RG, String nome, String tipo, String senha) {
        super(nome, RG);
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

    public void closeAccount(String senha) {
        if (senha.equals(this.senha)) {
            if (this.saldo > 0) {
                System.out.println("Ainda existe dinheiro na conta. Para fechar a conta deposite todo seu saldo!");
            } else {
                this.saldo = 0.0;
                this.nome = null;
                this.tipo = null;
                this.RG = null;
                this.senha = null;
                this.status = false;
                System.out.println("Conta fechada!");
            }
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    public void deposit(Double amount) {
        this.saldo += amount;
    }

    public void withdraw(Double amount, String senha) throws SaldoInsuficienteException {
        if (this.senha.equals(senha)) {
            if (this.saldo < amount) {
                throw new SaldoInsuficienteException("Saldo insuficiente", null);
            } else {
                this.saldo -= amount;
            }
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    @Override
    public void showInfo() {
        System.out.println(this.nome + " " + this.RG + " " + this.tipo);
    }

    @Override
    public String toString() {
        return "ContaBancaria [saldo=" + saldo + ", nome=" + nome + ", tipo=" + tipo + ", RG=" + RG + ", status="
                + status + "]";
    }

}
