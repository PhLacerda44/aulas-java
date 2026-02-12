package br.com.digithink.Ex02;

public class Horario {

    //Atributos
    private String cidade;
    private int hora;

    //Construtor
    public Horario(String cidade, int hora){
        this.cidade = cidade;
        this.hora = hora;

        System.out.println("Horário em" + cidade + "é: " + novoHorario()) ;
    }

        //Método para retornar o horário da cidade selecionada
        private int novoHorario(){
            int horarioLocal = 0;

            switch (cidade) {
                case "Nova Iorque":
                horarioLocal = hora - 1;    
                break;

                case "Tóquio":
                horarioLocal = hora + 12;
                break;

                case "Lisboa":
                horarioLocal = hora + 3;
                break;
            }

            if (horarioLocal > 23) {
                 horarioLocal = horarioLocal - 24;
            }

            return horarioLocal;
        }
}
