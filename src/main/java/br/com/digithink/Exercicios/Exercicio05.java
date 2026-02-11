package br.com.digithink.Exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

     Scanner obj = new Scanner(System.in);

     //Primeiro Nímero
     System.out.println("Informe o primeiro número");
     int numero1 = obj.nextInt();

     //Segundo número
     System.out.println("Informe o segundo número");
     int numero2 = obj.nextInt();

     //Cálculo
     System.out.println("Selecione o cálculo");
     System.out.println("1- Somar");
     System.out.println("2- Subtrair");
     System.out.println("3- Multipicar");
     System.out.println("4- Dividir");
     int calculo = obj.nextInt();

     //Fecha o Scanner
     obj.close();
    
     
    
    double retorno;

    
    switch (calculo) {
      case 1:
        retorno = numero1 + numero2;
        break;
      
      case 2: 
        retorno = numero1 - numero2;
        break;
      
        case 3:
        retorno = numero1 * numero2;
      break;
      
      case 4:
        retorno = numero1 / numero2;
      break;
    
      default:
        System.out.println("Operação Inválida");
        retorno = 0;
        break;
    }



    //Switch
    retorno = switch(calculo){
        case 1 -> numero1 + numero2;
        case 2 -> numero1 - numero2;
        case 3 -> numero1 * numero2;
        case 4 -> numero1 / numero2;
        default -> 0;
    };
    


  }
}
