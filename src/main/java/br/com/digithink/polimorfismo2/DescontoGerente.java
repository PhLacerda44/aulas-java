package br.com.digithink.polimorfismo2;

public class DescontoGerente extends DescontoPadrao {

     //Imposte de renda
    @Override
    public double impostoRenda(double salario){
        return salario * 0.15;
    }
    
}
