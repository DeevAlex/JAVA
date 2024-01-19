package Excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {

            System.out.println(7 / entrada.nextInt());

            entrada.close();

        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        } finally { // esse bloco serve para que mesmo que ocorra um erro (independente do erro) ou não executamos uma instrução que estiver dentro das {}
            System.out.println("finally #1");
            entrada.close(); // usado para não usar recursos mesmo que haja um erro, por exemplo, em um banco de dados, podemos fechar a conexão nesse bloco de codigo
        }


        // Podemos usar o finally sem o catch também
//        try {
//
//            System.out.println(7 / entrada.nextInt());
//
//            entrada.close();
//
//        } finally { // esse bloco serve para que mesmo que ocorra um erro (independente do erro) ou não executamos uma instrução que estiver dentro das {}
//            System.out.println("finally #2");
//            entrada.close(); // usado para não usar recursos mesmo que haja um erro, por exemplo, em um banco de dados, podemos fechar a conexão nesse bloco de codigo
//        }

        System.out.println("Fim");

    }

}
