package br.com.digithink.pooAilton.abstracao;

import lombok.Getter;
import lombok.Setter;

public abstract class Funcionario {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private double salario;

    abstract double calculaHoras();

    public double getBonificacao(){
        return this.salario * 0.1;
    }
    
}
