package Generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        // public class CaixaInt<X> extends Caixa<X>
        // CaixaInt<String> caixaA = new CaixaInt<>();

        // caixaA.guardar("Teste");

        // String coisaA = caixaA.abrir();

        // System.out.println(coisaA);



        // public class CaixaInt extends Caixa<Integer> // quando criamos um tipo Generico apenas estamos atrasando a definição daquele tipo para o momento mais apropriado quando for ser usada ou mesmo quando instanciarmos ou for criar uma herança para resolver
        CaixaInt caixaA = new CaixaInt();

        caixaA.guardar(123);

        Integer coisaA = caixaA.abrir(); // podemos fazer desse jeito porque já resolvemos colocando apenas em quem a vai passar a herança

        System.out.println(coisaA);

    }

}
