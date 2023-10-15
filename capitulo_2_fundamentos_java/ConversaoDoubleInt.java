public class ConversaoDoubleInt {
	
	public static void main(String[] args) {
		double largura = 100.37;
		//int largura_int = largura;
		// error: incompatible types: possible lossy conversion from double to int

		int largura_int = (int) largura;
		
		System.out.println("Valor da largura: " + largura_int);
	}
}