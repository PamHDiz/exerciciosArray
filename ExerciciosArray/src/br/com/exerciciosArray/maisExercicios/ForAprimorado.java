package br.com.exerciciosArray.maisExercicios;

public class ForAprimorado {

	public static void main(String[] args) {
		
		int[] meuArray = {12, 15, 32, 75, 98, 67, 13, 27, 82};
		int total = 0;
		
		for(int numero : meuArray) {
			total += numero;
		}
		
		System.out.println("A somatória total é: " + total);
		
	}

}
