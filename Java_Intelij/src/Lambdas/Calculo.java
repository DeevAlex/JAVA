package Lambdas;

@FunctionalInterface // usado para esclarecer que usaremos apenas um metodo/função, não é obrigatorio colocar essa annotation mas ele gera um erro com mais de um metodo/função na interfaee
public interface Calculo {

    double executar(double a, double b); // só pode ter um metodo abstrato!
    default String legal() {
        return "legal";
    }

    static String muitoLegal() {
        return "Muito Legal"; // nos metodos static não tem acesso ao this, portanto não podemos usar o metodo executa
    }

}
