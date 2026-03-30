import java.util.Scanner;

public class lay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, peso1, peso2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        peso1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        peso2 = sc.nextDouble();

        media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        System.out.println("Média ponderada: " + media);

        sc.close();
    }
}
