import java.util.Scanner;

public class Preco {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite a porcentagem do IPI a ser acrescido no valor das peças");
    double ipi = leitura.nextDouble();

    System.out.println("\nDigite o código da peça 1");
    int codigopeca1 = leitura.nextInt();

    System.out.println("Digite o valor unitário da peça 1");
    double valorpeca1 = leitura.nextDouble();

    System.out.println("Digite a quantidade de peças do tipo 1");
    int quantidadepeca1 = leitura.nextInt();

    System.out.println("\nDigite o código da peça 2");
    int codigopeca2 = leitura.nextInt();

    System.out.println("Digite o valor unitário da peça 2");
    double valorpeca2 = leitura.nextDouble();

    System.out.println("Digite a quantidade de peças do tipo 2");
    int quantidadepeca2 = leitura.nextInt();

    double total = (valorpeca1 * quantidadepeca1 + valorpeca2 * quantidadepeca2) * (1 + ipi / 100);

    System.out.printf("\nO valor total a ser pago é de: R$ %.2f", total);

    leitura.close();
  }
}
