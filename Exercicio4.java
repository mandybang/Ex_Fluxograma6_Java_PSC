/**Faça um programa que efetue reserva de passagens aéreas de uma companhia. 
 * O programa deverá ler informações sobre os voos (número, origem e destino) 
 * e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados). 
 * Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
consultar;
efetuar reserva; e
sair.
Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes opções:
por número do voo;
por origem; e
por destino.
Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pessoa deseja viajar. 
O programa deverá dar as seguintes respostas:
reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
voo lotado — caso não exista lugar disponível nesse voo;
voo inexistente — caso o código do voo não exista.
A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação de 
consulta ou reserva, o programa volta ao menu principal.
 */

import java.util.Scanner;

class Voo {
    private int numeroVoo;
    private String origem;
    private String destino;
    private int lugaresDisponiveis;

    public Voo(int numeroVoo, String origem, String destino, int lugaresDisponiveis) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void reservarLugar() {
        if (lugaresDisponiveis > 0) {
            lugaresDisponiveis--;
            System.out.println("Reserva confirmada!");
        } else {
            System.out.println("Voo lotado!");
        }
    }
}

public class Exercicio4 {
    private static Voo[] voos = {
        new Voo(101, "São Paulo", "Rio de Janeiro", 100),
        new Voo(102, "Rio de Janeiro", "São Paulo", 80)
        // Adicione os demais voos conforme necessário
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    consultarPorNumeroVoo();
                    break;
                case 2:
                    efetuarReserva();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n### Menu Principal ###");
        System.out.println("1. Consultar");
        System.out.println("2. Efetuar reserva");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void consultarPorNumeroVoo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do voo: ");
        int numeroVoo = scanner.nextInt();

        for (Voo voo : voos) {
            if (voo.getNumeroVoo() == numeroVoo) {
                System.out.println("Origem: " + voo.getOrigem());
                System.out.println("Destino: " + voo.getDestino());
                System.out.println("Lugares disponíveis: " + voo.getLugaresDisponiveis());
                return;
            }
        }
        System.out.println("Voo inexistente.");
        scanner.close();
    }

    private static void efetuarReserva() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do voo: ");
        int numeroVoo = scanner.nextInt();

        for (Voo voo : voos) {
            if (voo.getNumeroVoo() == numeroVoo) {
                voo.reservarLugar();
                return;
            }
        }
        System.out.println("Voo inexistente.");
        
        scanner.close(); }
}