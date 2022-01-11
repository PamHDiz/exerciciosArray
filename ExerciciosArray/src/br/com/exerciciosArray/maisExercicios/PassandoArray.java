package br.com.exerciciosArray.maisExercicios;

public class PassandoArray {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.printf("Efeitos de passar uma referência para todo o Array:%n" +
		 "Os valores do Array original são:%n");
		
		//gera a saída do valor original
		for(int valor: array) {
			System.out.printf("  %d", valor);
		}
		
		modificaArray(array); // passa a referência do do tipo Array de inteiros
		System.out.printf("%n%nO valor do array modificado é:%n");
		
		for(int valor: array) {
			System.out.printf("  %d", valor); // gera a saída do array modificado
		}
		
		System.out.printf("%n%nEfeitos de passar o valor de um elemento do array:%n" +
		"Array[3] antes de modificaElemento: %d%n", array[3]);
		
		modificaElemento(array[3]); // tenta modificar o elemento array[3]
		System.out.printf("Array[3] depois de modificaElemento: %d%n", array[3]);
	}
		
		//multiplica cada elemento do array por 2
		public static void modificaArray(int[] array2) {
			
			for(int i = 0; i < array2.length; i++) {
				array2[i] *= 2;
			}
		}
		
		//multiplica argumento por 2
		public static void modificaElemento(int elemento) {
			elemento *= 2;
			System.out.printf("O Valor do elemento em modificaElemento: %d%n", elemento);
		}

}
