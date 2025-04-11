import java.util.Scanner;

public class SucessorAnt {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = leitura.nextInt();

    if (numero % 2 == 0) {
      System.out.println("O número digitado é um número par.");
    } else {
      System.out.println("O número digitado é um número ímpar.");
    }

    System.out.println("Seu antecessor é: " + (numero - 1));

    System.out.println("Seu sucessor é: " + (numero + 1));

    leitura.close();
  }
}
