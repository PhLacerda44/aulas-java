package br.com.digithink.Exercicios;

public class Exercicio09 {
    public static void main(String[] args) {

        //Vetor
        int[] numeros = {5,8,3,1,9};
        
        //Váriaveis
        int par =0;
        int impar=0;

        //Laço de repetição
        for(int indice=0; indice<5; indice++){
            
            if (numeros[indice] % 2 ==0){
                par++;
            }else{
                impar++;

            }
                
        }

        //Exibir quantidade
        System.out.println("Par" + par);
        System.out.println("Ímpar" + impar);

    }
}
