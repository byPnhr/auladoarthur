 java.util.Scanneimportr;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("digite o segundo número: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Média = " + media);

        sc.close();

    }

    
}
