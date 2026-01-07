package br.com.digithink;

public class Matriz {

    public static void main(String[] args) {
        
        //Matriz
        String [][] clientes = {
            {"Paulo", "joinville"},
            {"Cleber","Campinas"},
            {"Julia","Curitiba"},
        };

        //EXIBIR
        for(int indice=0; indice<3; indice ++){
            System.err.println("\nNome: " + clientes[indice] [0]);
            System.err.println("Cidade: " + clientes[indice] [1]);            
        }
        
    }
    
}
