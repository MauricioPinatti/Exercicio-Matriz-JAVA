import java.util.Scanner;

public class Exercicio_07 {

    // Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.
    // Entrada:
    // A entrada contém o valor N, depois os dados da matriz.
    // Saída:
    // A saída contém a soma dos elementos da diagonal principal

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) { // j inicia com i+1
                soma = soma + mat[i][j];
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
