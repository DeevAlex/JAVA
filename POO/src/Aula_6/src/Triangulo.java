public class Triangulo {

    double base, altura;

    Triangulo() {};

    Triangulo(double b, double a) {
        base = b;
        altura = a;
    };

    double getBase() {
        return base;
    };

    void setBase(double b) {
        base = b;
    }

    double getAltura() {
        return altura;
    }

    void setAltura(double a) {
        altura = a;
    }

    double calculaArea() {
        return base * altura / 2;
    }

    void imprimeDados() {
        System.out.println("\n" + "A base do triangulo é: " + base);
        System.out.println("A altura do triangulo é: " + altura + "\n");
    }

}
