package Atv5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      float renda;
      double value;
      Cliente client;
      Scanner s = new Scanner(System.in);
      ContaBancaria cb;
      String name, email, phone, RG, senha;
      ContaBancaria conta;
      int tipo, op;

      try {
         System.out.println("Informe o nome: ");
         name = s.nextLine();
         System.out.println("Informe o email: ");
         email = s.nextLine();
         System.out.println("Informe o telefone: ");
         phone = s.nextLine();
         System.out.println("Informe o RG: ");
         RG = s.nextLine();
         System.out.println("Informe a renda: ");
         renda = Float.parseFloat(s.nextLine());
         client = new Cliente(name, email, phone, RG, renda);
         System.out.println("Informe o tipo de conta: ");
         tipo = Integer.parseInt(s.nextLine());

         System.out.println("Informe o tipo da conta: ");
         tipo = Integer.parseInt(s.nextLine());

         System.out.println("Informe a nova senha: ");
         senha = s.nextLine();
         conta = new ContaBancaria(tipo, senha, client);

         do {
            showMenu();
            op = Integer.parseInt(s.nextLine());
            switch (op) {
               case 1:
                  System.out.println("Informe o valor: ");
                  value = Double.parseDouble(s.nextLine());
                  conta.deposit(value);
                  break;
               case 2:
                  System.out.println("Informe o valor: ");
                  value = Double.parseDouble(s.nextLine());
                  conta.withdraw(value);

                  break;
               case 3:
                  conta.closeAccount();

                  break;
               case 0:
                  System.out.println("over!");
                  break;
               default:
                  System.out.println("opção invalida");
                  break;
            }

         } while (op != 0);

      } catch (InputMismatchException im) {
         System.out.println(im.getMessage());
      } catch (SaldoInsuficienteException si) {
         System.out.println(si.getMessage());
      }
      catch(NumberFormatException nf){
         System.out.println("Valor não válido");
      }

   }

   public static void showMenu() {
      System.out.println("1 - deposito");
      System.out.println("2 - Saque");
      System.out.println("3 - fechar conta");
      System.out.println("0 - sair");

   }
}
