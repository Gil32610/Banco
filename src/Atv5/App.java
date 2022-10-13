package Atv5;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      float renda;
      Cliente client;
      Scanner s = new Scanner(System.in);
      ContaBancaria cb;
      String name, email, phone, RG, senha, tipo;
      ContaBancaria conta;
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
         renda = s.nextFloat();
         
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

}
