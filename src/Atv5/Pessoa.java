package Atv5;

public class Pessoa {
    protected String nome;
    protected String email;
    protected String phone;
    protected String RG;

   

    public Pessoa(String nome, String email, String phone, String RG) {
        this.nome = nome;
        this.email = email;
        this.phone = phone;
        this.RG = RG;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRG() {
        return this.RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + ", phone=" + phone + ", RG=" + RG + "]";
    }

}
