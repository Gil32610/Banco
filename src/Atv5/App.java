package Atv5;

import java.util.Scanner;
import java.util.LinkedList;
public class App {
   public static void main(String[] args) {
      Double dep;
      Cliente client;
      Scanner s = new Scanner(System.in);
      LinkedList<Cliente> c = new LinkedList<>();
      ContaBancaria cb;
      String name, email, phone, RG, senha, tipo;
      int op;

      do {
         try {
            showMenu();
            op = Integer.parseInt(s.next());
            switch (op) {
               case 1:
                  System.out.println("Informe o nome: ");
                  name = s.nextLine();
                  System.out.println("Informe o email: ");
                  email = s.nextLine();
                  System.out.println("Informe o numero de telefone: ");
                  phone = s.nextLine();
                  System.out.println("Informe o rg: ");
                  RG = s.nextLine();
                  client = new Cliente(phone, RG);
                  client.setEmail(email);
                  client.setPhone(phone);
                  break;
               case 2:
                  System.out.println("Informe a senha: ");
                  senha = s.nextLine();
                  System.out.println("Informe o tipo: ");
                  tipo = s.nextLine();
                  cb = new ContaBancaria(c.getRG(), c.getNome(), "CC", senha);
                  break;
               case 3:
                  System.out.println("Informe o valor para depósito:");
                  dep = Double.parseDouble(s.nextLine());
                  cb.deposit(dep);
               break;
            }

         } catch (SaldoInsuficienteException si) {
            System.out.println(si.getMessage());
         } catch (NumberFormatException nf) {
            System.out.println(nf.getMessage());
         }

      } while (op != 0);

   }

   public static void showMenu() {
      System.out.println(" 1- Cadastra cliente");
      System.out.println("2 - Criar conta");
      System.out.println("3 - Fazer depósito");
      System.out.println("4 - Saque");
      System.out.println("5 - Fechar conta ");
      System.out.println("0 - Encerrar");

   }
}
