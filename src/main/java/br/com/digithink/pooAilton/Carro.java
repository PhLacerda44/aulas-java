package br.com.digithink.pooAilton;

import lombok.Generated;
import lombok.Setter;

public class Carro extends Veiculo {

    @Generated @Setter
    private String proprietario;

    @Override
    public String somDaBuzina(){
        return "BIII-BIII";
    }
    
}
