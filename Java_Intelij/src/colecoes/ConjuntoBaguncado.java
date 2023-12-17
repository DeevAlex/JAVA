package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// o hashset não aceita valores primitivos, e valores iguais
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // ele vai converter double -> Double
		conjunto.add(true); // ele vai converter boolean -> Boolean
		conjunto.add("streams.Teste"); // aqui não vai
		conjunto.add(1); // ele vai converter int -> Interger
		conjunto.add('x');// ele vai converter char -> Character
		
		System.out.println("tamanho do conjunto: " + conjunto.size());
		
		// aqui ele adiciona pois o t é minusculo e outro é maiusculo
		conjunto.add("streams.Teste");
		conjunto.add('x');
		
		System.out.println("tamanho do conjunto: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // false pois não tem o teste com a letra t minuscula
		System.out.println(conjunto.remove("streams.Teste")); // aqui vai ser true pois tem letra T maiuscula
		System.out.println(conjunto.remove('x')); // aqui vai ser true pois tem letra X maiuscula
		
		System.out.println("tamanho do conjunto: " + conjunto.size());
		
		System.out.println("Contém a letra x? " + conjunto.contains('x')); // verifica se contém algo no conjunto
		System.out.println("Contém a letra x? " + conjunto.contains(1));
		System.out.println("Contém a letra x? " + conjunto.contains(false));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums); // interseção entre dois conjuntos - elementos comuns em ambos conjuntos
		
		System.out.println(conjunto);
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
		
		// No caso dos tipos primitivos não são Objetcs, por isso eles não são suportados pelas collections, porém fica muito tranquilo, porque você pode
		// informar valores primitivos que ele automaticamente converte para um Object, que é um conceito chamado auto-box, que seria o wrapper
		
	}
	
}
