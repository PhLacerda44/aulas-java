package br.com.digithink.Abstracao;

public abstract class Crud {

    //Métodos obrigatórios
    public abstract void cadastrar();
    public abstract void selecionar();
    public abstract void alterar();
    public abstract void remover();

    //Método opcionais
    public void mensagem(){
        System.out.println("Método opcional");
    }
    
}
