public class Main {

	public static void main(String[] args) {
		PrettyPrinter pp = new PrettyPrinter();
		SimpleMath calc = new SimpleMath();
		int resultAddition = calc.addition(5, 8);
		pp.print(Integer.toString(resultAddition));
	}
	
}