package br.com.digithink.Ex05;

public class Main {

    public static void main(String[] args) {
        
        // REALIZAR TESTES
        Produto p1 = new Produto();
        p1.imposto(1000);

        Produto p2 = new Vestuario();
        p2.imposto(1000);

        Produto p3 = new Eletronico();
        p3.imposto(1000);
    }
    
}
