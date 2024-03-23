import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Insira uma nota entre 0 e 10: ");
        nota = scanner.nextInt();
        if (nota <= 0 ) {
            System.out.println(" A nota " +nota+ " é uma nota valida.");
        }
        if ( nota > 0 && nota <=10) {
        System.out.println(" A nota " +nota+ " é uma nota valida.");
        }
         if (nota > 10) {
            System.out.println(" Nota invalida, tente novamente.");
        }
     
      scanner.close();
    }
}