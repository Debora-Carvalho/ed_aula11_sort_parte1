package ed_aula11_sort_parte1;

public class Principal {

	public static void main(String[] args) {
		int[] valores = {3,5,6,8,4,56,3,2,9};
		
		bubbleSort(valores);
		imprime(valores);
	}

	private static void imprime(int[] valores) {
		for(int valor : valores) {
			System.out.print(valor + "\t");
		}
		
	}

	private static void bubbleSort(int[] valores) {
		for (int j = 0; j < valores.length; j++) {
			for (int i = 0; i < valores.length - 1 - j; i++) {
				if (valores[i] > valores[i+1]) {
					//trocar valor, inserindo o maior valor do vetor na última posição
					int temp = valores[i];    //criando a variavel temp para guardar o valor de i
					valores[i] = valores[i+1];
					valores[i+1] = temp;
				}
				
			}
			
		}
		
	}

}
