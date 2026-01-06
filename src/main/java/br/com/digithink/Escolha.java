package br.com.digithink;

public class Escolha {

    public static void main(String[] args){

        //VARIAVEL
        String cidade = "São Paulo";

        // Estrutura de escolha
        switch (cidade) {
            case "São Paulo":
            System.out.println("A maior cidade do país");
            break;

            case"Rio de Janeiro":
            System.out.println("Cidade belas praias");
            break;

            default:
                System.out.println("Cidade não encontrada");
        }
    }
    
}
