/**Faça um programa que preencha um vetor com oito números inteiros, 
 * calcule e mostre dois vetores resultantes. O primeiro vetor resultante 
 * deve conter os números positivos e o segundo, os números negativos. 
 * Cada vetor resultante vai ter, no máximo, oito posições, que não 
 * poderão ser completamente utilizadas. */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo o vetor
        int[] vetor = new int[8];
        
        // Preenchendo o vetor
        System.out.println("Preencha o vetor com 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Definindo os vetores para números positivos e negativos
        int[] vetorPositivo = new int[8];
        int[] vetorNegativo = new int[8];
        
        // Contadores para os vetores de números positivos e negativos
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        
        // Separando os números positivos e negativos
        for (int i = 0; i < 8; i++) {
            if (vetor[i] >= 0) {
                vetorPositivo[contadorPositivo] = vetor[i];
                contadorPositivo++;
            } else {
                vetorNegativo[contadorNegativo] = vetor[i];
                contadorNegativo++;
            }
        }
        
        // Exibindo os vetores resultantes
        System.out.println("Vetor resultante dos números positivos:");
        for (int i = 0; i < contadorPositivo; i++) {
            System.out.print(vetorPositivo[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vetor resultante dos números negativos:");
        for (int i = 0; i < contadorNegativo; i++) {
            System.out.print(vetorNegativo[i] + " ");
        }
        
        scanner.close();
    }
}