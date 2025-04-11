import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Qual o valor atual do salário mínimo?");
    System.out.print("R$");
    double salariomin = leitura.nextDouble();

    System.out.println("Quanto você recebe?");
    System.out.print("R$");
    double salario = leitura.nextDouble();

    if (salario < salariomin) {
      System.out.println("\nVocê recebe menos do que 1 salário mínimo.");
    }

    if (salario == salariomin) {
      System.out.println("\nVocê recebe 1 salário mínimo.");
    }

    else {
      double quantidade = salario / salariomin;
      System.out.printf("\nVocê recebe %.1f salários minímos", quantidade);
    }

    leitura.close();
  }
}
