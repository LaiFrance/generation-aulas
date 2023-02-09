import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float n1, n2;
        System.out.println("digite o 1 numero:");
        n1 = leia.nextFloat();

        System.out.println("digite o 2 numero:");
        n2 = leia.nextFloat();

        leia.close();
    }
}
