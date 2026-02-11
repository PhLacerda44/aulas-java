package br.com.digithink.Exercicios;

/*
    Peça duas notas, exiba a média e a situação.

    Média 7 ou superior = Aprovado.
    Média inferior a 7 = Reprovado.
*/

import java.util.Scanner;

public class Exercicio01 {

    void main() {
        
        // Objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Obter primeira nota
        System.out.println("Informe a primeira nota");
        double nota1 = obj.nextDouble();

        // Obter segunda nota
        System.out.println("Informe a segunda nota");
        double nota2 = obj.nextDouble();

        // Fecha o Scanner e libera os recursos associados ao stream de entrada (System.in)
        obj.close();

        // Realizar média
        double media = (nota1 + nota2) / 2;

        // Situação
        if(media >= 7){
            System.out.println("Aprovado com média " + media);
        }else{
            System.out.println("Reprovado com média " + media);
        }

    }
    
}
