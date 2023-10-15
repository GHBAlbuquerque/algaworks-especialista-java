public class ConversaoLongParaInt {
	
	public static void main(String[] args) {
		/*		
		long x = 10;
		int y = x;

		error: incompatible types: possible lossy conversion from long to int
		não deve voltar, pois pode ocorrer perda de informação
		é possível forçar um casting
		*/
		
		long x = 10;
		int y = (int) x; //casting

		
		System.out.println("Valor de y: " + y);
	}
}