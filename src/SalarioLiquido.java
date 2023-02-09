import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos;
        float salarioLiquido;

        // leitura de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o salário bruto? ");
        salarioBruto = entrada.nextFloat();
        System.out.println("Qual o adicional noturno? ");
        adicionalNoturno = entrada.nextFloat();
        System.out.println("Quantas horas extras foram trabalhadas? ");
        horasExtras = entrada.nextFloat();
        System.out.println("Qual o total de descontos? ");
        descontos = entrada.nextFloat();

        // cálculo do salário líquido
        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        // exibição do salário líquido
        System.out.println("O salário líquido é R$ " + salarioLiquido);
    }
}