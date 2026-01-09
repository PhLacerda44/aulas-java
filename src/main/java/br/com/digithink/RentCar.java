package br.com.digithink;

import java.io.IOException;
import java.util.Scanner;

public class RentCar {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int indice = 0;

        String[] clientes = new String[10];
        int totalClientes = 0;

        String[] veiculos = new String[10];
        int totalVeiculos = 0;

        while (true) {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("##########################");
            System.out.println("#     Aluguel de Carros  #");
            System.out.println("##########################");

            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Visualizar Cliente");
            System.out.println("3 - Cadastrar Veículo");
            System.out.println("4 - Visualizar Veículos");
            System.out.println("5 - Alugar Carro");
            System.out.println("6 - Concluir Aluguel");
            System.out.println("7 - Sair do sistema");

            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    if (totalClientes < clientes.length) {
                        System.out.println("Digite o nome do cliente:");
                        String nomeCliente = scanner.nextLine();
                        clientes[totalClientes] = nomeCliente;
                        totalClientes++;
                        System.out.println("Cliente cadastrado com sucesso! Pressione enter para continuar...");
                        scanner.nextLine();
                    } else {
                        System.out.println("Não é possível cadastrar mais clientes");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    indice = 0;
                    for (String cliente : clientes) {
                        if (cliente != null) {
                            System.out.println("Código: " + indice + " - Nome: " + cliente);
                        }
                        indice++;
                    }

                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();
                    break;

                case 3:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    if (totalVeiculos < veiculos.length) {
                        System.out.println("Digite o nome do Veículo:");
                        String nomeVeiculo = scanner.nextLine();
                        veiculos[totalVeiculos] = nomeVeiculo;
                        totalVeiculos++;
                        System.out.println("Veículo cadastrado com sucesso!");
                        scanner.nextLine();
                    } else {
                        System.out.println("Limite de veículos atingido");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    indice = 0;
                    for (String veiculo : veiculos) {
                        if (veiculo != null) {
                            System.out.println("Código: " + indice + " - Nome: " + veiculo);
                        }
                        indice++;
                    }

                    System.out.println("Pressione enter para continuar...");
                    scanner.nextLine();
                    break;

                
                case 5:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    String[][] aluguelClientes = {
                        {"Pedro", "Gol G3"},
                        {"Rafael", "Tera"},
                        {"Roger", "Fox"}
                    };

                    for (indice = 0; indice < 3; indice++) {
                        System.out.println("\nNome: " + aluguelClientes[indice][0]);
                        System.out.println("Veículo: " + aluguelClientes[indice][1]);
                    }

                    System.out.println("\nPressione enter para continuar...");
                    scanner.nextLine();
                    break;

                

                case 6:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                   System.out.println("Digite o nome do cliente:");
                   String nomeCliente = scanner.nextLine();
                    
                    



                case 7:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida");
                    scanner.nextLine();
            }
        }
    }
}

