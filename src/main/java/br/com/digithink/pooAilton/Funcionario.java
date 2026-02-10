package br.com.digithink.pooAilton;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {

    public Funcionario(int registro, String nome){
        this.registro = registro;
        this.nome = nome;
        System.out.println("Construtor da classe pai (Funcionario)");
    }

    @Getter @Setter
    private int registro;

    @Getter @Setter
    private String nome;
    
}
