import java.util.Scanner;

public class Idade {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Qual o seu ano de nascimento?");
    int anonascimento = leitura.nextInt();

    int idade = 2025 - anonascimento;

    System.out.println("Então você tem " + idade + " anos de idade.");

    leitura.close();
  }
}
