import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int primeiroValor = 0;
        int segundoValor = 0;
        int valorTotal = 0;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("informe o primeiro valor");
       primeiroValor = scanner.nextInt();
       System.out.println("informe o segundo valor");
       segundoValor = scanner.nextInt();
      
       valorTotal = primeiroValor - segundoValor; 
       
       
       
        scanner.close();
        
        
        System.out.println("O valor total eh: " + valorTotal); 
    }
}
