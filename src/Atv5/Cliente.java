package Atv5;

public class Cliente extends Pessoa {
    private float renda;
    


    public Cliente(String nome,String email,  String phone, String RG, float renda) {
        super(nome, email, phone, RG);
        this.renda=renda;
    }

    public void showInfo() {

        System.out.println(this.nome + " " + this.email + " " + this.phone);
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", RG=" + RG + ", email=" + email + ", phone=" + phone + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cliente) {
            Cliente aClient = (Cliente) obj;
            return this.getRG().equals(aClient.getRG());
        }
        return false;
    }
}
