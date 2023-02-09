import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1, n2;
        System.out.println("digite o 1 numero:");
        n1 = leia.nextDouble();

        System.out.println("digite o 2 numero:");
        n2 = leia.nextDouble();

        System.out.println("O numero" + n1 + "elevado ao numero" + n2 + "é igual a" + Math.pow(n1,n2));


        leia.close();
    }
}
