public class ExemploLong {
	
	public static void main(String[] args) {
		long população = 699_097;
		long populacao2 = 2_147_483_648;
		// error: integer number too large -> pois um literal é sempre inteiro.
		// necessário explicitamente declarar comolong com L.

		System.out.println("População: " + populacao2);

	}
}