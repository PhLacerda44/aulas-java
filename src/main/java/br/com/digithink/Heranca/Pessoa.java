package br.com.digithink.Heranca;

public class Pessoa {
    
    //Atributos
     protected String nome;
     protected int idade;

     //Constrtutor
     public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade =idade;
     }

     //Método
     protected void mensagemPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
     }
}
