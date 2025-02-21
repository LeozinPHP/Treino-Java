import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner Show = new Scanner(System.in);
        System.out.println("Qual o nome do vendedor?");
        String vendedor = Show.nextLine();

        System.out.println("Em dinheiro, qual o valor total de suas vendas?");
        int vendas = Show.nextInt();
        

        System.out.println("Qual o valor do seu salário?");
        int salario = Show.nextInt();

        int comissao = 15 * + vendas / 100;
        int total = salario + comissao;

        System.out.println("O seu nome é: " +vendedor); 
        System.out.println("O valor fixo do seu salário é de: " +salario);
        System.out.println("O valor de seu salário final com 15% de comissão de vendas é de: " +total);
        
        Show.close();
    }   
}
