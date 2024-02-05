package br.com.cod3r.cm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    // Aula para ajudar a configurar o JUnit: https://www.youtube.com/watch?v=Zug8zYR0SmA

    @Test
    public void testarSeIgualADois() {
        int a = 1 + 1;
        assertEquals(2, a);
    }

    @Test
    void testarSeIgualATres() {
        int x = 2 + 10 - 7;
        assertEquals(3, x);
    }


}