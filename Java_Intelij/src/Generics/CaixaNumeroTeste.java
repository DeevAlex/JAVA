package Generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        // Não pode ser, pois colocamos uma restrição que o tipo somente pode ser um tipo que herda da classe Number
        // CaixaNumero<String> caixaA = new CaixaNumero<String>();
        // caixaA.guardar("Teste");

        // Como nesse caso que herda da classe Number
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(5.5);

        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(4);

        System.out.println(caixaB.abrir());

    }

}
