package capitulo_2_fundamentos_java;

public class ExemploLong {
	
	public static void main(String[] args) {
		long população = 699_097;
		long populacao2 = 2_147_483_648L;
		// error: integer number too large -> pois um literal é sempre inteiro.
		// necessário explicitamente declarar comolong com L.

		System.out.println("População: " + populacao2);

	}
}