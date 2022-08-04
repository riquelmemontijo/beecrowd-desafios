package br.com.riquelme.matematica;

import java.util.Locale;
import java.util.Scanner;

/*

1170 - Blobs

No planeta Alpha vive a criatura Blobs, que come precisamente 1/2 de seu suprimento de comida disponível
todos os dias. Escreva um algoritmo que leia a capacidade inicial de suprimento de comida (em Kg), e
calcule quantos dias passarão antes que Blobs coma todo esse suprimento até restar um quilo ou menos.

Entrada

A primeira linha de entrada contem um único inteiro N (1 ≤ N ≤ 1000), indicando o número de casos de
teste. As N linhas seguintes contém um valor de ponto flutuante C (1 ≤ C ≤ 1000) correspondente à
quantidade de comida disponível para Blobs.

Saída

Para cada caso de teste, imprima uma linha contendo o número de dias que Blobs irá demorar para comer todo seu suprimento de comida, seguido da palavra "dias".

 */


public class Beecrowd1170 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int N = scanner.nextInt();

        for(int j = 0; j < N; j++){
            double C = scanner.nextDouble();
            int count = 0;
            while(C > 1){
                C = C / 2;
                count++;
            }
            System.out.println(count +" dias");
        }
        scanner.close();
    }
}
