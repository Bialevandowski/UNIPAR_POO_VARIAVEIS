import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        Double nota1 = 0.0;
        Double nota2 = 0.0;
        Double valorMedia = 0.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados");
        System.out.println("Informe seu nome:");
        nome = scanner.nextLine();
        System.out.println("Informe sua idade:");
        idade = scanner.nextInt();
        System.out.println("Informe sua nota 1:");
        nota1 = scanner.nextDouble();
        System.out.println("Informe sua nota 2:");
        nota2 = scanner.nextDouble();
       
       valorMedia = (nota1 + nota2) / 2; 
       
       
       
        scanner.close();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("A media final e: " + valorMedia); 
    }
}
