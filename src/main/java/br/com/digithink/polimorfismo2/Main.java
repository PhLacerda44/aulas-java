package br.com.digithink.polimorfismo2;

public class Main {

    public static void main(String[] args) {
        
        //Criar projeto
        DescontoPadrao obj = new DescontoDesenvolvedor();
        System.out.println("Imposto de renda: " + obj.impostoRenda(1000));
        System.out.println("Vale transporte: " + obj.valeTransporte(1000));
    }
    
}
