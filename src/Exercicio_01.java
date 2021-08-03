import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

    // ler e imprimir uma matriz na tela

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        // utiliza-se o "i" para percorrer as linhas
        // utiliza-se o "j" para percorrer as colunas
        // instanciando a matriz
        for (int i=0; i<M; i++) {
            for(int j=0; j<N; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // para imprimir a matriz
        for (int i=0; i<M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
