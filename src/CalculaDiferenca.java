import java.util.Scanner;

public class CalculaDiferenca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor : ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite o segundo valor : ");
        float n2 = entrada.nextFloat();
        System.out.println("Digite o terceiro valor : ");
        float n3 = entrada.nextFloat();
        System.out.println("Digite o quarto valor : ");
        float n4 = entrada.nextFloat();

        float resultado = (n1 * n2) - (n3 * n4);

        System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " + resultado);

    }
}
