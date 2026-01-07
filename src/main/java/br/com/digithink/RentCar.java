package br.com.digithink;

import java.io.IOException;
import java.util.Scanner;

public class RentCar {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "";
        String nomeveiculo  = "";
        
        while(true){
           
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            System.out.println("##########################");
            System.out.println("#     Aluguel de Carros  #");
            System.out.println("##########################");

            System.out.println("Menu de Opções:");
            System.out.println(" 1 - Cadastrar Cliente"); // Nome
            System.out.println(" 2 - Visualizar Cliente"); 
            System.out.println(" 3 - Cadastrar Veículo"); // Marca - Modelo
            System.out.println(" 4 - Visualizar Veículo"); // Marca - Modelo
            System.out.println(" 5 - Alugar Carro");
            System.out.println(" 6 - Sair do sistema");
        

            // Obter nome
            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            // Estrutura de escolha
            switch (opcao) {
                case 1:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Digite o nome do cliente:");
                    nomeCliente = scanner.nextLine();
                    System.out.println("Cliente cadastrado com sucesso! Pressione enter para continuar...");
                    scanner.nextLine();
                    break;

                case 2:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Clientes Cadastrados");
                    System.out.println(nomeCliente);
                    System.out.println("pressione enter para continuar...");
                    scanner.nextLine();
                    break;

                case 3:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Cadastre seu veículo");
                    nomeveiculo = scanner.nextLine();
                     System.out.println("Veículo cadastrado com sucesso! Pressione enter para continuar...");
                    scanner.nextLine();
                    break;

                case 4:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Veículos Cadastrados");
                    System.out.println(nomeveiculo);
                    System.out.println("pressione enter para continuar...");
                    scanner.nextLine();
                    break;


                case 5:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Carros livres para locação:");
                    System.out.println("Gol G3");
                    System.out.println("Gol G3");
                    System.out.println("Gol G3");
                    scanner.nextLine();
                    break;

                case 6:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Saindo do sistema...");

                    scanner.nextLine();
                    scanner.close();
                    return;
                
                default:
                    System.out.println("opção invalída");
                break;


            }



        }

        


    }
    
}
