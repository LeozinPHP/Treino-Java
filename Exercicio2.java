import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner Consumo = new Scanner(System.in);
        System.out.println("Digite Distância total percorrida (EM KM)");
        int rodada = Consumo.nextInt();

        System.out.println("Digte o Total de combustível gasto");
        int tanque = Consumo.nextInt();

        System.out.println("A média de consumo é de " + rodada / + tanque);

        Consumo.close();
    }
}
