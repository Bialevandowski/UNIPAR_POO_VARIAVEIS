import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       
 int primeiroValor = 0;
 int segundoValor = 0;
int soma = 0;  
 int subtracao = 0;
int divisao = 0;
int multiplicacao = 0;
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.println("informe o primeiro valor");
       primeiroValor = scanner.nextInt();
       
       System.out.println("informe o segundo valor:");
       segundoValor = scanner.nextInt();
       
         soma = primeiroValor + segundoValor;
        System.out.println("a soma eh :"+ soma);
       
          subtracao = primeiroValor - segundoValor;
       System.out.println("a  subtracao eh :"+  subtracao);
       
         divisao = primeiroValor / segundoValor;
        System.out.println("a divisao eh :"+divisao);
       
        multiplicacao = primeiroValor * segundoValor;
       System.out.println("a multiplicacao eh :"+ multiplicacao);
       
         scanner.close();
        
        
    }
}
