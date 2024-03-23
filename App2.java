import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String login;
        String senha;

        System.out.print("\nQual será o seu login: ");
        login = scanner.nextLine();
        System.out.print("\nQual será sua senha: ");
        senha = scanner.nextLine();

        if (login.equals(senha)){
            System.out.println("\n\n Sua senha não pode ser igual ao seu login, tente novamente.");

        } else {
            System.out.print("\n Login cadastrado.");
        }
        scanner.close();
    }
}