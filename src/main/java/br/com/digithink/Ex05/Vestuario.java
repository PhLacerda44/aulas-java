package br.com.digithink.Ex05;

public class Vestuario extends Produto{

    //Método para calcular o imposto
    @Override
    public void imposto(double valor){
        System.out.println("Desconto padrão: " + (valor * 0.10));
    }
    
}
