import java.util.Scanner; 

public class PlanoDeSaudeCase {
      public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();
        int valorPlano = 0;
        switch (idade) {
            case 10:
                valorPlano = 100;
                break;
            case 29:
                valorPlano = 200;
                break;
            case 45:
                valorPlano = 300;
                break;
            case 59:
                valorPlano = 500;
                break;
            case 65:
                valorPlano = 600;
                break;
            default:
                if (idade > 65) {
                    valorPlano = 1000;
                } else {
                    System.out.println("Idade inválida.");
                    break;
                }
        }
        System.out.println("O valor do seu plano de saúde é de R$" + valorPlano + ".");
    }
}
