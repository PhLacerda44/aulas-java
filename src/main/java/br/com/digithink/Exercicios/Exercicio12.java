package br.com.digithink;

public class Exercicio12 {

    void main() {
        
        // Matriz
        int[][] numeros = {
            {4, 6, 8},
            {9, 1, 3},
            {2, 7, 5}
        };

        // Soma
        int soma = 0;

        // Laço de repetição - Linha
        for(int linha = 0; linha < 3; linha++){

            // Laço de repetição - Coluna
            for(int coluna = 0; coluna < 3; coluna++){

                // Exibir número
                System.out.print(numeros[linha][coluna] + " ");

                // Somar
                soma += numeros[linha][coluna];

            }

            // Quebra de linha
            System.out.println();

        }

        // Exibir a soma dos valores
        System.out.println("A soma é: " + soma);
    }
}

