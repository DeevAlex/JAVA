public class Funcionario {

    int cracha;
    float salario;
    String cargo;

    Funcionario() {};

    Funcionario(int c, float s, String car) {
        cracha = c;
        salario = s;
        cargo = car;
    };

    float calculaAumento(float porcentagem) {
        return salario + ((salario * porcentagem) / 100);
    }

    float calculaAumento(int tempo) {
        for(int i = 0; i < tempo; i++) {
            salario += 150;
        }
        return salario;
    }

}
