package Atv5;

public class Cliente {
    protected String nome;
    protected String RG;
    private String email;
    private String phone;

    public Cliente(String nome, String RG) {
        this.RG = RG;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void showInfo() {

        System.out.println(this.nome + " " + this.email + " " + this.phone);
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", RG=" + RG + ", email=" + email + ", phone=" + phone + "]";
    }

}
