import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner Trocar = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int valor1 = Trocar.nextInt();

        System.out.println("Digite o segundo valor");
        int valor2 = Trocar.nextInt();

        System.out.println("Os valores foram trocados! verique:");
        System.out.println("Valor 1 agora é valor 2: " + valor2);
        System.out.println("Valor 2 agora é valor 1: " + valor1);
        
        Trocar.close();
 }
}
