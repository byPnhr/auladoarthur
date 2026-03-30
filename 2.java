import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um número: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("número par");
        } else {
            System.out.println("número ímpar");
        }
        sc.close();



    }
}
