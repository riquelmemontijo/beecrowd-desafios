package br.com.riquelme;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

1168 - LED

João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem
certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números abaixo,
faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o valor.

Obs.: Para programadores de Javascript, recomenda-se o uso de "input.trim().split('\n')" para evitar
erros conhecidos.

Entrada

A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número de casos de teste, seguido de N
linhas, cada linha contendo um número (1 ≤ V ≤ 10100) correspondente ao valor que João quer montar com
os leds.

Saída

Para cada caso de teste, imprima uma linha contendo o número de leds que João precisa para montar o
valor desejado, seguido da palavra "leds".

*/

public class Beecrowd1168 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapaDeLeds = new HashMap<>();

        //Hashmap atribuindo a quantidade de led usado em cada algarismo
        mapaDeLeds.put("0", 6);
        mapaDeLeds.put("1", 2);
        mapaDeLeds.put("2", 5);
        mapaDeLeds.put("3", 5);
        mapaDeLeds.put("4", 4);
        mapaDeLeds.put("5", 5);
        mapaDeLeds.put("6", 6);
        mapaDeLeds.put("7", 3);
        mapaDeLeds.put("8", 7);
        mapaDeLeds.put("9", 6);

        int N = scanner.nextInt();
        scanner.nextLine();
        int j = 0;

        while(j < N){
            String numero = scanner.nextLine();
            Integer soma = 0;

            String[] arrayNumero = numero.split("");

            for(int i = 0; i < arrayNumero.length; i++){
                soma = soma + mapaDeLeds.get(arrayNumero[i]);
            }
            System.out.println(soma + " leds");
            j++;
        }

    }

}
