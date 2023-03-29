package Aula_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = geraNumerosAleatorios();
        }

        System.out.println(Arrays.toString(inverter(nums, 5)));

        System.out.println(Arrays.toString(nums));


    }

    public static int geraNumerosAleatorios() {
        return (int) Math.floor(Math.random() * 100);
    }

    static int[] inverter(int[] array, int tamanho) {
        int[] novoArray = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            novoArray[tamanho - 1 - i] = (int) array[i];
        }

        return novoArray;
    }

    static int[] inverter(int[] array) {
        int[] novoArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            novoArray[array.length - 1 - i] = (int) array[i];
        }

        return novoArray;
    }

}