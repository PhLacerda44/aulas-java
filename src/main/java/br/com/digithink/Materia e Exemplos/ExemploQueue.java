

import java.util.Queue;

import java.util.LinkedList;

public class ExemploQueue {
    public static void main(String[] args) {
        
        // Queue
        Queue <String> nomes = new LinkedList();
        
        //Cadastros
        nomes.offer("Ana");
        nomes.offer("Beatriz");
        nomes.offer("Carla");

        //Remover
        nomes.poll();

        //Exibir
        System.out.println(nomes);


    }
    
}
