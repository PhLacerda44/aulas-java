package br.com.digithink.pooAilton;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {

    public Gerente(int registro, String nome){
        super(registro, nome);
    }

    @Getter @Setter
    private double salario;
    
}
