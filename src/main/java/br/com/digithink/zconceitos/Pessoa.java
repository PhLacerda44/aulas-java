package br.com.digithink.zconceitos;

public class Pessoa {
    
    //Atributos
    String nome;
    int idade;

    //Método de apresentação
    void apresentação(){
        System.out.println("Olá" + nome + "voce tem" + idade + "anos.");
    }

    // Método para retornar a situação
    String situacaoIdade(){
        return idade >= 18 ? "Maior de idade" : "Menor de idade";    
    }

}


