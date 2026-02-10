package br.com.digithink.pooAilton;

import lombok.Getter;
import lombok.Setter;

public class Veiculo {

    @Getter @Setter
    private String marca;

    @Getter @Setter
    private String modelo;

    public String somDaBuzina(){
        return "Foom-fomm";
    }
    
}
