import java.util.Scanner;

public class Exercicio_06 {

    // Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha.
    // Suponha não haver empates.
    // Entrada:
    // A entrada contém o número N, depois os dados da matriz.
    // Saída:
    // A saída contém os números representando o maior elemento de cada linha da matriz

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<N; i++) {
            int maior = mat[i][0];
            for (int j=1; j<N; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            System.out.println(maior);
        }
        sc.close();
    }
}

/*
 // 1: primeiro vamos encontrar a posicao da maior idade
        int maiorIdade = idades[0];
        int posicaoMaiorIdade = 0;

        for (int i=1; i<N; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;
            }
        }

        // 2: agora vamos acessar o vetor de nomes na posicao da maior idade
        System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
 */