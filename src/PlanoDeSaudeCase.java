import java.util.Scanner; 

public class PlanoDeSaudeCase {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        double valor = 0.0;
        
        if (idade <= 10) {
            valor = 100;
        } else if (idade <= 29) {
            valor = 200;
        } else if (idade <= 45) {
            valor = 300;
        } else if (idade <= 59) {
            valor = 500;
        } else if (idade <= 65) {
            valor = 600;
        } else {
            valor = 1000;
        }
        
        System.out.println("O valor do plano de saúde para a idade informada é: " + valor + " reais.");
    }
}
