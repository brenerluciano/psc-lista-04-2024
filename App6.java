import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3,n4,n5,calculo;
        System.out.print("Digite 5 número, um por vez. ");
        System.out.println("1º número: ");
        n1 = scanner.nextInt();
        System.out.println("2º número: ");
        n2 = scanner.nextInt();
        System.out.println("3º número: ");
        n3 = scanner.nextInt();
        System.out.println("4º número: ");
        n4 = scanner.nextInt();
        System.out.println("5º número: ");
        n5 = scanner.nextInt();

        calculo = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));

        System.out.println("O maior número será: " + calculo);

        scanner.close();
    }
}