package br.com.digithink;

import java.util.Stack;

public class ExemploStack {

    /** Stack: Ultimo elemento é o primeiro que sai (Navegação, Histórico) */
    public static void main(String[] args) {
        
        //Stack
        Stack<String> paginas = new Stack<>();

        //Cadastros
        paginas.push("https://github.com/PhLacerda44?tab=repositories");
        paginas.push("https://chatgpt.com/c/6989e399-1020-8331-b4a4-b3df47eff7d9");
        paginas.push("https://inventre.com.br/tratamentos/");

        //Remoção 
        paginas.pop();

        // Peek
        System.out.println(paginas.peek());

        //Exibir registros
        System.out.println(paginas);
    }
    
}
