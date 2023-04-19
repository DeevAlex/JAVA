
package PacoteTeste;

interface TAD_Queue {
// tipo abstrato de dado que descreve a Fila
//Retornam se a fila está vazia ou cheia:
public boolean isEmpty(); //verifica se a fila está vazia
public boolean isFull(); //só usa em alocação estática de memória
//Insere um elemento no final da fila:
public Filmes enqueue(Filmes x);
//Remove um elemento do início da fila:
public Filmes dequeue();
//Retorna o objeto no início da fila (o primeiro da fila), sem eliminar:
public Filmes peek() throws Exception ;
//Retorna o conteúdo (todos os elementos) da fila (da Queue):
public String toString();
}

public class Queue implements TAD_Queue {
    
    private int total = 0; //Contador de elementos (0 se a fila estiver vazia)
    private int head = -1; //Início da queue (head = -1 se a fila estiver vazia)
    private int tail = -1; //Final da queue (convenção: tail = -1 se fila vazia)
    private Filmes memo[]; //Vetor para armazenar os objetos da fila
    private int MAX; //Capacidade do vetor, diferente do atributo total
    
    public Queue() {
        MAX = 1000; //capacidade para 1000 objetos
        memo = new Filmes[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }

    public Queue(int qtde) { //construtor
        MAX = qtde; //capacidade solicitada
        memo = new Filmes[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }
    
    public boolean isEmpty() {
        return(total == 0);
    }

    public boolean isFull() {
       return(total == MAX);
    }

    public Filmes enqueue (Filmes x) {
        if( !isFull() && x!=null ) { // pré-condições
        if( ++tail >= MAX ) tail = 0; // avançamos a cauda (circular)
        if ( head == -1 ) head = tail; // se a fila estava vazia
        memo[tail] = x;
        total++;
        return x;
    }
    else return null; //não podemos inserir se a fila está cheia ou x==null
    }

    public Filmes dequeue () {
    if( !isEmpty() ) { //verificamos a pré-condição
            Filmes objeto = memo[head];
            if( ++head >= MAX) head = 0; //avançamos a cabeça (circular)
            total--;
            if( total == 0 ) { //se a fila ficou vazia
            head = -1;
            tail = -1;
        }
            return objeto; //retornamos o objeto que estava na cabeça
    }
    else return null; //não podemos retirar de uma fila vazia
    }

    public Filmes peek() throws Exception {
        if( !isEmpty() ) return ( memo[head] );
        else throw new Exception("a fila está vazia");

    }

    public String toString () {
        if( !isEmpty() ) {
        String saida = "";
        int pos = head; //variável auxiliar, para não alterar head
        for(int i=1; i <= total; i++) { // total é a qtde. de elementos
        saida += memo[pos].getTitulo()+ ", diretor: " + memo[pos].getDiretor() + ", " + memo[pos].getGenero() + ", " + memo[pos].getPais() + ", " + memo[pos].getAno();
        if (i != total)  saida += ", \n";    
        pos++;
        if ( pos >= MAX ) pos = 0;
        }
        return ( "F: " + " [ \n" + saida + " \n]" );
        }
        else return ( "F: [ ]" ); // fila vazia
   }

    
}
