package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Js", "Python", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs); // como não estamos utilizando generics precisamos fazer o casting aqui
        System.out.println(ultimaLinguagem1);

        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums); // como não estamos utilizando generics precisamos fazer o casting aqui
        System.out.println(ultimoNumero1);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs); // como temos o generics não precisamos fazer o casting
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums); // de forma explicita nessa chamada o tipo integer na lista (não precisa)
        System.out.println(ultimoNumero2);

    }

}
