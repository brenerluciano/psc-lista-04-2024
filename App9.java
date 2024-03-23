import java.util.Scanner;
public class App9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2;
        
        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();
         System.out.println("Números interios no intervalo ["+ numero1 + "," + numero2 +"]: ");

         for(int i = numero1; i <= numero2; i++){
            System.out.println(i);
         }
    
        scanner.close();
        }
    }

     
