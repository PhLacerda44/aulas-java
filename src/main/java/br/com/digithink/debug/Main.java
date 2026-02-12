package br.com.digithink.debug;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Início do método main");
        metodo1(2);
        System.out.println("Fim do método main");
    }

    //
    private static void metodo1(int imposto) throws Exception{

        System.out.println("início do método 1");

        if (imposto < 3){
            Exception ex = new Exception("O valor do imposto não pode ser menor que 3");
            throw ex;
        }

        metodo2();

        System.out.println("Fim do método 1");
    }

    //
    private static void metodo2(){

        System.out.println("Início do método 2");
        for (int i = 0; i <=5; i++){
            System.out.println("Valor do i: " + i);
        }
        System.out.println("Fim do método2");
    }
}
