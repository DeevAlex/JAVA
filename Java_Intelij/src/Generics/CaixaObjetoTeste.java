package Generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        // Exemplo sem Generics

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // jogando um literal aqui automaticamente o valor é convertido para uma classe do tipo primitivo colocado aqui (essa ação é chamada de AutoBox) e depois é colocado dentro do wrapper (wrapper é a classe que envolve um primitivo)

        // Integer coisa = (Integer) caixaA.abrir(); // quando tentamos fazer um cast com ele lá em cima da essa exceção: ClassCastException (ocorre quando esperasse um tipo, porém vem outro então gerasse essa exceção), para 'resolver' faça:

        Double coisaA = (Double) caixaA.abrir(); // só que não queremos fazer esse cast então usasse o Generics

        System.out.println(coisaA);


        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");

        String coisaB = (String) caixaB.abrir();

        System.out.println(coisaB);

    }

}
