import java.util.Scanner;
public class App4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int populacaoA,populacaoB;
        double taxaCrescimentoA, taxaCrescimentoB;
        System.out.println("Qual o tamanho da população A: ");
        populacaoA = scanner.nextInt();
        System.out.println("Qual o tamanho da população B: ");
        populacaoB = scanner.nextInt();
        System.out.println("Insira a taxa de crecimento da população A em %. Ex: 0,03 = 3%:\n");
        taxaCrescimentoA = scanner.nextDouble();
        System.out.println("Insira a taxa de crecimento em população B em %. Ex: 0,03 = 3%:\n");
        taxaCrescimentoB =scanner.nextDouble();
        
        

        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população do país A ultrapassará a população do país B.");
        System.out.println("População do país A: " + populacaoA);
        System.out.println("População do país B: " + populacaoB);

        scanner.close();
    }
}