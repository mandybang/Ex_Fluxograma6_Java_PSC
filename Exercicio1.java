/**Faça um programa que preencha um vetor com nove números inteiros, 
 * calcule e mostre os números primos e suas respectivas posições. */

 import java.util.Scanner;
 /**
  * Exercicio1
  */
 public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] vetor = new int[9];
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite o número na posição " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }
        
        // Verificando e mostrando os números primos e suas posições
        System.out.println("Números primos e suas respectivas posições:");
        for (int i = 0; i < vetor.length; i++) {
            if (isPrimo(vetor[i])) {
                System.out.println("Número: " + vetor[i] + ", Posição: " + (i + 1));
            }
        }
    scanner.close();
    }
    
    // Função para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    
    }
}