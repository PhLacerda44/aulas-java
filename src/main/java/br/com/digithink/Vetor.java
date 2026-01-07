package br.com.digithink;

public class Vetor {
    
    public static void main(String[] args) {
        
        //VETOR (array)
        String[] nomes = {"Pedro","Murilo","Gustavo", "Gabriel"};


        System.out.println(nomes.length);

        // Exibição de dados
        // System.out.println(nomes{2});
        for(int indice=0; indice<nomes.length; indice ++){
            System.out.println(indice +"-"+ nomes[indice]);
        }

        System.out.println("\n\n");


        int contador = 0;
        for (String nome : nomes) {
            System.out.println(contador +"-"+ nome);
            contador++;
        }



    }
}
