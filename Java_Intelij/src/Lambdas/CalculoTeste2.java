package Lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        // primeira função lambda, iguais ao arrow function no JS

        // o java sabe que tem um metodo lá na classe Calculo então, ele permite que funcione esse codigo, só que tem que ter os mesmos parametros do unico metodo que esteja lá, e deve retornar o mesmo tipo de retorno do metodo da interface
        Calculo calculo = (x, y) -> {
            return x + y;
        };

        calculo = (x, y) -> x * y; // um return está implicito nessa function lambda e não precisa colocar o corpo do metodo com chaves

        System.out.println(calculo.executar(5, 7));
        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());

    }

}
