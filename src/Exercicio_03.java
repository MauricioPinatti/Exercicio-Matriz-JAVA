import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {

    //Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
    //de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
    //elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
    //Mostrar o vetor gerado

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        double[][] numeros = new double[M][N];

        for (int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                numeros[i][j] = sc.nextDouble();
            }
        }

        // criando um vetor que vai receber a soma dos valores de cada linha da matriz

        double[] vet = new double[M];

        // a soma fica dentro do "forzão" para que a cada linha ela some os elementos de cada coluna daquela linha
        for(int i=0; i<M; i++){
            double soma = 0.0;
            for(int j=0; j<N; j++){
                soma = soma + numeros[i][j];
            }
            vet[i] = soma;
        }

        // imprimindo o vetor

        for(int i=0; i<M; i++){
            System.out.printf("%.1f%n", vet[i]);
        }

        sc.close();
    }
}
