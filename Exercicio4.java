import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner Area = new Scanner(System.in);
        System.out.println("Digite o valor da base:");
        int valor1 = Area.nextInt();

        System.out.println("Digite o valor da altura:");
        int valor2 = Area.nextInt();

        Area.nextLine();

        System.out.println("Qual a unidade de medida?");
        String unidade = Area.nextLine();
            
        Area.close();

        System.out.println("A área de triangulo é de:" +valor1 * +valor2 / 2 + unidade);

    }
}