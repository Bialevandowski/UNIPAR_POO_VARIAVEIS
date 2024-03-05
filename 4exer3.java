import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Double nota1 = 0.0;
        Double nota2 = 0.0;
        Double nota3 = 0.0;
        Double nota4 = 0.0;
        Double valorMedia = 0.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua nota 1:");
        nota1 = scanner.nextDouble();
        System.out.println("Informe sua nota 2:");
        nota2 = scanner.nextDouble();
        System.out.println("Informe sua nota 3:");
        nota3 = scanner.nextDouble();
        System.out.println("Informe sua nota 4:");
        nota4 = scanner.nextDouble();
       
       valorMedia = (nota1 + nota2 + nota3 + nota4) / 4; 
       
       
       
        scanner.close();
        
        
        
        System.out.println("A media final e: " + valorMedia); 
    }
}
