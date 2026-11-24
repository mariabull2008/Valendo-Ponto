import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        System.out.print("Digite as 5 notas: ");

        // Leitura das 5 notas
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];

            if (notas[i] >= 7.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / notas.length;

        // Exibição dos resultados
        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        scanner.close();
    }
}