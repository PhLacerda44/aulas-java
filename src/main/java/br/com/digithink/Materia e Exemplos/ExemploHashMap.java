package br.com.digithink;

import java.util.HashMap;

public class ExemploHashMap {
    
    /** Uma estrutura de dados que guarda informações em pares chave → valor. */
    public static void main(String[] args) {
        
        // HashMap
        HashMap<String , String> linguagens = new HashMap<>();

        //Cadastros
        linguagens.put("Java" , "Linguagens Multiplataforma");
        linguagens.put("HTML" , "Linguagens de marcação");
        linguagens.put("CSS" , "Linguagem de Estilos");

        //Remoção
        linguagens.remove("java");

        // Exibir informações referente a linguagem java
        System.out.println(linguagens.get("Java"));
    }
}
