import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome ,sexo , estadocivil ;
        int idade;
        double salario;

        System.out.println("Qual o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Qual a sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Informe seu salário: ");
        salario = scanner.nextDouble();
        System.out.println("");
        estadocivil = scanner.nextLine();
        System.out.println("Informe seu sexo: ");
        sexo = scanner.nextLine().toLowerCase();
        System.out.println("Qual o seu estado civil: ");
        estadocivil = scanner.nextLine().toLowerCase();

       if (nome.getBytes().length <= 3) {
        System.out.println("O nome tem que ter mais que 3 caracteres: ");
            
        }else {
            System.out.println(nome);
        }
        if (idade < 0){
            System.out.println("A indede tem que ser entre 0 e 150");
        }if (idade >  150){
            System.out.println("A indede tem que ser entre 0 e 150"); 
            }else{
            System.out.println("Idade: " + idade);
        }
        if (salario <= 0) {
            System.out.println("O salário tem que ser maior que 0.");
            }else{
                System.out.println("Salário: " + salario);
            }
           if (sexo.equals("masculino") || sexo.equals("feminino")){
            System.out.println("Sexo: " + sexo);
        }else {
            System.out.println("O sexo tem que ser Masculino ou Feminino");
        } 
        if(estadocivil.equals("solteiro") || estadocivil.equals("casado") || estadocivil.equals("viuvo") || estadocivil.equals("divorciado")){
            System.out.println("Estado Civil: " + estadocivil);
        } else {
            System.out.println("Estado civil incorreto.");
        } 

    
    
       scanner.close(); 
    }
}