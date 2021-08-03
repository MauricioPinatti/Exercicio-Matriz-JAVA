import java.util.Scanner;

public class Exercicio_08 {

    //) Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada. Depois,
    //gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais.
    //Imprimir na tela a matriz gerada.
    //Entrada:
    //A entrada contém os valores de M e N, depois os valores da primeira matriz A, depois os valores da segunda matriz B,
    //conforme exemplo.
    //Saída:
    //A saída contém os valores da matriz gerada C, conforme exemplo

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] A = new int[M][N];
        int[][] B = new int[M][N];
        int[][] C = new int[M][N];

        // leitura da matriz A
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // leitura da matriz B
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // geracao da matriz C
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // impressao da matriz C na tela
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
