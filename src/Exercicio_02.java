import java.util.Scanner;

public class Exercicio_02 {

    //Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
    //contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
    //de valores negativos da matriz.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        // utiliza-se o "i" para percorrer as linhas
        // utiliza-se o "j" para percorrer as colunas

        // instanciando a matriz
        for (int i=0; i<N; i++) {
            for(int j=0; j<N; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // para imprimir a DIAGONAL PRINCIPAL da matriz
        for (int i=0; i<N; i++) {
                System.out.print(mat[i][i] + " ");
            }
            System.out.println();

        // descobrindo os numeros negativos digitados
        int cont = 0;
        for (int i=0; i<N; i++) {
            for(int j=0; j<N; j++){
                if(mat[i][j] < 0){
                    cont = cont + 1;
                }
            }
        }
        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

        sc.close();
    }
}
