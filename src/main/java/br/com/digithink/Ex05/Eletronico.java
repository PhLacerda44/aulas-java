package br.com.digithink.Ex05;

public class Eletronico extends Produto {

    //Método para calcular o imposto
    public void imposto(double valor){
        System.out.println("Desconto eletrônico: " + (valor * 0.15));
    }
    
}
