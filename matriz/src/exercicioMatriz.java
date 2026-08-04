/*
Fazer um programa para ler dois números inteiros M e N, 
e depois ler uma matriz de M linhas por N colunas contendo 
números inteiros, podendo haver repetições. Em seguida, 
ler um número inteiro X que pertence à matriz. Para cada 
ocorrência de X, mostrar os valores à esquerda, acima, à 
direita e abaixo de X, quando houver, conforme exemplo.
*/

import java.util.Scanner;

public class exercicioMatriz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int linhas, colunas;

        System.out.print("Informe o número de linhas da matriz: ");
        linhas = sc.nextInt();

        System.out.print("Informe o número de colunas da matriz: ");
        colunas = sc.nextInt();

        int [][] matriz = new int [linhas][colunas];

        for (int i = 0; i < linhas; i ++){
            for (int j = 0; j < colunas; j++){
                System.out.print("Informe o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Informe o número que deseja buscar na matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < linhas; i ++){
            for (int j = 0; j < colunas; j++){
                if ( matriz[i][j] == x){
                    System.out.printf( "Posição [%d][%d]: %d\n", i, j, x);

                    //Verificando esquerda
                    if( j == 0 ){
                        System.out.println( "Não temos esquerda");
                    } else{
                        System.out.printf( "Posição [%d][%d]: %d\n", i, j - 1, matriz[i][j-1]);
                    }

                    //Verificando direita
                    if( j == colunas - 1 ){
                        System.out.println( "Não temos direita");
                    } else{
                        System.out.printf( "Posição [%d][%d]: %d\n", i, j + 1, matriz[i][j+1]);
                    }

                    //Verificando cima
                    if( i == 0 ){
                        System.out.println( "Não temos cima");
                    } else{
                        System.out.printf( "Posição [%d][%d]: %d\n", i - 1, j, matriz[i - 1][j]);
                    }

                    //Verificando baixo
                    if( i == linhas - 1 ){
                        System.out.println( "Não temos baixo");
                    } else{
                        System.out.printf( "Posição [%d][%d]: %d\n", i + 1, j, matriz[i + 1][j]);
                    }
                }else{
                    continue;
                }
            }
        }


        sc.close();
    }
}
