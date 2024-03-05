import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        double preco = 0.0;
        double desconto = 0.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados  ");
        System.out.println("Informe seu nome:");
    System.out.println("qual o preco do produto:");
         preco = scanner.nextDouble();
         System.out.println("Qual o porcentual de desconto:");
       desconto = scanner.nextDouble();
       
       double total = preco - (preco*(desconto/100));
        
        scanner.close();
        
       System.out.println("Nome "+ total);

         
    }
}
