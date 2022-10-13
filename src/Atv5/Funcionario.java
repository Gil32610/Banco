package Atv5;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String email, String phone, String RG, String cargo){
        super(nome, email, phone, cargo);
        this.cargo=cargo;
    }

    @Override
    public String toString() {
        return this.toString()+ "Funcionario [cargo=" + cargo + "]";
    }

    

}
