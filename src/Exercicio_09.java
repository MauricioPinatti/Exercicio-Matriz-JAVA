import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09 {

    //) Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
    //a) calcular e imprimir a soma de todos os elementos positivos da matriz.
    //b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
    //c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
    //d) imprimir os elementos da diagonal principal da matriz.
    //e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.
    //Entrada:
    //A entrada contém o número inteiro N, seguido dos valores da matriz com uma casa decimal cada, seguido do índice de
    //uma linha, seguido do índice de uma coluna, conforma exemplo.
    //Saída:
    //A saída contém os valores de saída de cada ação, com uma casa decimal, na ordem em que foram apresentadas no
    //enunciado

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[][] mat = new double[N][N];

        // leitura dos dados de entrada
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        // a) soma dos positivos
        double soma = 0.0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] > 0.0) {
                    soma = soma + mat[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);;

        // b) imprimir os elementos da linha escolhida
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j=0; j<N; j++) {
            System.out.printf("%.1f ", mat[linha][j]);
        }
        System.out.println();

        // c) imprimir os elementos da coluna escolhida
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i=0; i<N; i++) {
            System.out.printf("%.1f ", mat[i][coluna]);
        }
        System.out.println();

        // d) imprimir a diagonal principal
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i=0; i<N; i++) {
            System.out.printf("%.1f ", mat[i][i]);
        }
        System.out.println();

        // e) alterar a matriz elevando os negativos ao quadrado
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] < 0.0) {
                    mat[i][j] = mat[i][j] * mat[i][j];
                }
            }
        }
        System.out.println("MATRIZ ALTERADA:");
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.printf("%.1f ", mat[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
