import java.util.Scanner;

// Classe Principal
public class Média {
    // Define input como estático
    static Scanner input = new Scanner(System.in);

    // Método para perguntar número (retorna double)
    public static double perguntar_número(String prompt) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    // Método para calcular média entre a e b
    public static double calcular_média(double a, double b) {
        return (a + b) / 2;
    }

    // Main
    public static void main(String[] args) {
        double n1 = perguntar_número("Digite um número: ");
        double n2 = perguntar_número("Digite outro número: ");
        double média = calcular_média(n1, n2);

        System.out.println("A média entre " + n1 + " e " + n2 + " é " + média);
        input.close();
    }
}
