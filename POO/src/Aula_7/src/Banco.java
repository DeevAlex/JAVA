public class Banco {


    String cliente;
    int numeroConta;
    double saldo;

    Banco() {

    }

    Banco(int nConta, double s, String c) {
        cliente = c;
        numeroConta = nConta;
        saldo = s;
    }

    double getSaldo() {
        return saldo;
    }

    double sacarDinheiro(double quantia) {
        return saldo -= quantia;
    }

    double depositar(double deposito) {
        return saldo += deposito;
    }



}
