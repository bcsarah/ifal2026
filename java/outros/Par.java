import java.util.Scanner;

// Classe Principal
public class Par {
    // Define input como estático
    static Scanner input = new Scanner(System.in);
    
    // Método para perguntar número (retorna int)
    public static int perguntar_número(String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    // Verifica se um número é par. Retorna true se sim, false se não
    public static boolean verificar_paridade(int num) {
        return num % 2 == 0;
    }

    // Main
    public static void main(String[] args) {
        int num = perguntar_número("Digite um número: ");

        if (verificar_paridade(num)) {
            System.out.print("É par!");
        } else {
            System.out.print("É impar!");
        }

        input.close();
    }
}
