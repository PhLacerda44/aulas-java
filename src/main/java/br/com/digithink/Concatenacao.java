package br.com.digithink;

public class Concatenacao {
    
    public static void main(String[] args) {
        
        //Variáveis
        String nome = "Pedro";
        int idade = 18;

        String textoGrande = """
                feriado

                feliz ano novo

                programação com java
                """;

        //Concatecação
        System.out.println("Olá " + nome +" você tem "+ idade+ " anos. ");
        System.out.println(String.format("Olá %s você tem %s anos", nome,idade));

        System.out.println(textoGrande);
    }
    
}
