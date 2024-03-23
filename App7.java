import java.util.Scanner;
public class App7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        int soma,media;
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

        soma = n1+n2+n3+n4+n5;
        media = n1+n2+n3+n4+n5 / 5;

        System.out.print("A soma dos números será: " + soma);
        System.out.print("\nA média desse números será de: " + media);
        
        scanner.close();
    }
}