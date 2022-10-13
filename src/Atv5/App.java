package Atv5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      float renda;
      Cliente client;
      Scanner s = new Scanner(System.in);
      ContaBancaria cb;
      String name, email, phone, RG, senha;
      ContaBancaria conta;
      int tipo;

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
         
      } catch (InputMismatchException im) {
         System.out.println(im.getMessage());
      } catch (SaldoInsuficienteException si) {
         System.out.println(si.getMessage());
      }

   }

}
