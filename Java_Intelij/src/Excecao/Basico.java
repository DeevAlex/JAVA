package Excecao;

public class Basico {

    // Pilha de Execução: Excecao.Basico.main(<classe>.java:<numero da linha>)
    // Pilha aumentada:
    // at Excecao.Basico.imprimirNomeAluno(Basico.java:22)
    //	at Excecao.Basico.main(Basico.java:16)

    // Threads são as linhas de execução
    // Aparece Excecão na linha principal -> Exception in thread "main"
    // Tipo do erro: java.lang.ArithmeticException: <Mensagem do Erro (De vez enquando não tem mensagem, apenas o erro)>

    // Erros do Tipo Error são os mais criticos e que fazem a aplicação ser interrompida
    // Erros do Tipo Exception não são tão criticos, a aplicação ainda consegue mostrar onde está o problema, como por exemplo, alguma requisição de algum lugar como em um banco de dados, ele fala o erro, sem a aplicação ser encerrada

    public static void main(String[] args) {

        Aluno a1 = null;

        // O try contém o codigo que PODE gerar um problema
        try {
            imprimirNomeAluno(a1);
        } catch (Exception ex) { // O catch pega o erro (ERRO GENERICO NESSE CASO) gerado na parte do try
            System.out.println("Ocorreu um erro, não conseguimos imprimir o nome do aluno");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) { // Podemos tratar o erro passando o erro especifico que no caso é esse ArithmeticException, (TENTE TRARAR O ERRO DE FORMA ESPECIFICA)
            System.out.println("Não podemos realizar essa operação: " + e.getMessage());
            // e.printStackTrace(); // Não é sincrono, pode aparecer fora de ordem
        }

        // Podemos silenciar os erros, é so deixar o cacth com algo comentado ou não ter nada, porém, não faça isso, no minimo coloque em um arquivo LOG com a hora que aconteceu

        System.out.println("Fim");

    }

    public static void imprimirNomeAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}
