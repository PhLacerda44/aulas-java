package br.com.digithink;

public class Condicional {
    
    public static void main(String[] args) {
        
        //Variável
        double nota = 7;

        //Condicional
        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if (nota >= 5) {
            System.out.println("Em recuperação");
        }else{
            System.out.println("reprovado");
        }

    }

}

