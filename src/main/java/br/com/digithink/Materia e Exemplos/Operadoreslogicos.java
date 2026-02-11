package br.com.digithink;

public class Operadoreslogicos {

    public static void main(String[] args) {

        //VARIÁVEIS
        String formadepagamento = "á vista";
        double valor = 200;

        //VERIFICAÇÃO
        System.out.println(formadepagamento == "á prazo" && valor >= 100);

        
    }
    
}
