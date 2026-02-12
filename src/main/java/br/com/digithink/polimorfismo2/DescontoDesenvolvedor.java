package br.com.digithink.polimorfismo2;

public class DescontoDesenvolvedor extends DescontoPadrao{

    //Imposto de renda
    public double impostoRenda(double salario){
        return salario * 0.12;
    }
    
}
