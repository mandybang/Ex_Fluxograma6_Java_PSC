/**Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo os vetores
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorInter = new int[20];
        
        // Preenchendo o primeiro vetor
        System.out.println("Preencha o primeiro vetor com 10 elementos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vetor1[i] = scanner.nextInt();
        }
        
        // Preenchendo o segundo vetor
        System.out.println("Preencha o segundo vetor com 10 elementos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        
        // Intercalando os vetores
        int indexVetor1 = 0;
        int indexVetor2 = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                vetorInter[i] = vetor1[indexVetor1];
                indexVetor1++;
            } else {
                vetorInter[i] = vetor2[indexVetor2];
                indexVetor2++;
            }
        }
        
        // Exibindo o vetor resultante
        System.out.println("Vetor resultante da intercalação:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorInter[i] + " ");
        }
        
        scanner.close();
    }
}