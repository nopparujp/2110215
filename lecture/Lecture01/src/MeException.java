

public class MeException {
	public static void main(String[] args) {
	
		
		try {
			int s = 2/0;
			System.out.println(s);
		} catch (Exception e) {
			//System.out.println(e.toString());
			System.out.println("helloworld");
		} /*catch (ArrayIndexOutOfBoundsException arrE) {
			System.out.println(arrE.toString());
			
		} catch (ArithmeticException aE) {
			System.out.println(aE);
			System.out.println(aE.toString());
			aE.printStackTrace();
			System.out.println("Aerror");
		}*/ 
	}

}