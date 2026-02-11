package br.com.digithink.polimorfismo2;

public class DescontoPadrao {
    
    // Imposto de renda
    public double impostoRenda(double salario){
        return salario * 0.10;
    }

    // Vale Transporte
    public double valeTransporte(double salario){
        return salario * 0.06;
    }

}
