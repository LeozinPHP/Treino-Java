import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner Test = new Scanner(System.in);
        System.out.println("Coloque um numero");
        int x = Test.nextInt();

        System.out.println("Coloque outro numero");
        int y = Test.nextInt();


        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
           

        Test.close();
    }
}