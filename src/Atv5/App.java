package Atv5;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cliente c;
        ContaBancaria cb;
        String name;
        String email;
        String phone;
        String RG;
        String senha;
        String tipo;


         try{
            System.out.println("Informe o nome: ");
            name = s.nextLine();
            System.out.println("Informe o email: ");
            email =s.nextLine();
            System.out.println("Informe o numero de telefone: ");
            phone = s.nextLine();
            System.out.println("Informe o rg: ");
            RG = s.nextLine();

            c = new Cliente(phone, RG);
            c.setEmail(email);
            c.setPhone(phone);

            System.out.println("Informe a senha: ");
            senha = s.nextLine();
            System.out.println("Informe o tipo: ");
            tipo = s.nextLine();
            cb = new ContaBancaria(c.getRG(), c.getNome(), "CC", senha);
            cb.deposit(100.00);
            cb.withdraw(101.00, senha);
            


         }
         catch(SaldoInsuficienteException si){
            System.out.println(si.getMessage());
         }
    }
}
