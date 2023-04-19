import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        Funcionario f1 = new Funcionario();
        f1.cargo = "Assistente";

        Funcionario f2 = new Funcionario(15, 1500f, "CEO");

        System.out.println("\n" + "Com essa porcentagem você receberia R$" + f2.calculaAumento(100f));
        System.out.println("R$150,00 somado no salário para cada ano trabalhado você teria: R$" + f2.calculaAumento(7) + "\n");

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(7, 5);

        double base, altura;

        System.out.println("Digite a base do triangulo: ");
        base = e.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        altura = e.nextDouble();

        t1.setBase(base);
        t1.setAltura(altura);

        t1.imprimeDados();

        System.out.println("A area do triangulo é: " + t1.calculaArea());

    }
}