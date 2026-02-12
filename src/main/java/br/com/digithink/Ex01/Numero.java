package br.com.digithink.Ex01;

public class Numero {
    
    //
    private int numero;

    //Construtor
    public Numero(int numero){
        this.numero= numero;

        parImpar();
        positivoNegativo();
    }

    // Método para verificar se é par ou ímpar
    private void parImpar(){
        System.out.println(numero % 2 == 0 ? "Par" : "Ímpar");
    }

    //Método para verificar se é positivo ou negativo
    private void positivoNegativo(){
        if (numero >=0) {
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
    }

}
