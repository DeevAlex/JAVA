package Excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) throws Exception {

        // Não basta incianciar um erro para mostra-lo (Coloque THROW antes do NEW)

        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Coloque o throws Exception na assinatura do metodo main também caso dê um erro, no meu caso, resolveu, mesmo tratando no metodo geraErro2 pediu para colocar no main também
        // geraErro2();

        // caso não tenha o tratamento no proprio metodo faça no metodo main
//        try {
//            geraErro2();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println("FIM");

    }

    // Exceção Não checada ou não verificada, nesse caso não precisamos colocar em um catch
    static void geraErro1() {

        // Instanciando um erro generico
        // só podemos colocar algo depois do throw, objetos que são derivados de trowable
        throw new RuntimeException("Ocorreu um erro bem legal #01!");

    }

    // Exceção Checada ou verificada
    static void geraErro2() throws Exception {

        // Aqui devemos colocar ao lado dos () nesse metodo isso: throws Exception
        // Podemos trata-la aqui mesmo
        try {
            throw new Exception("Ocorreu um erro bem legal #02!");
        } catch (Exception e) {
            System.out.println("que legal!");
        }

    }

}
