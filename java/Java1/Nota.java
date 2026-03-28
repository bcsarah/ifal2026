import java.util.Scanner;

// Classe Principal
public class Nota {
    // Define input como estático
    static Scanner input = new Scanner(System.in);

    // Método para perguntar nota
    public static double perguntar_nota(String prompt) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    // Método para calcular média
    public static double calcular_média(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método para verificar aprovação do aluno
    public static void verificar_aprovação(double média) {
        if (média >= 7) {
            System.out.print("Você está aprovado!");
        } else if (média >= 4) {
            System.out.print("Você está em recuperação!");
        } else {
            System.out.print("Você está reprovado!");
        }
    }

    // Main
    public static void main(String[] args) {
        double n1 = perguntar_nota("Digite sua primeira nota: ");
        double n2 = perguntar_nota("Digite sua segunda nota: ");
        double n3 = perguntar_nota("Digite sua terceira nota: ");
        double n4 = perguntar_nota("Digite sua quarta nota: ");

        double[] notas = new double[]{n1, n2, n3, n4};
        double média = calcular_média(notas);
        System.out.println("Você tirou " + média + "!");

        verificar_aprovação(média);
        input.close();
    }
}