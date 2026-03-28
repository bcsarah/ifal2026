import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo variáveis com o Scanner
        System.out.println("#  Calculadora Juros Compostos  #\n");

        System.out.print("Dinheiro inicial (C): ");
        double dinheiro = scanner.nextDouble();
        
        System.out.print("Juros (i, %): ");
        double porcentagem = scanner.nextDouble();
        porcentagem = porcentagem / 100;
        
        System.out.print("Anos (n): ");
        int anos = scanner.nextInt();


        // Output
        System.out.println();

        int potencia = 1;
        for (int i = 0; i < anos; i++) {
            System.out.println(i+1 + "° Ano: " + dinheiro * Math.pow(1 + porcentagem, potencia));
            potencia++;
        }

        scanner.close();
    }
}