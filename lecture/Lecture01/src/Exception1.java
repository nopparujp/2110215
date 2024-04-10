public class Exception1 {
	public static void main(String[] args) {
		int s[] = new int[2];

		try {
			for (int i = 1; i < 3; ++i) {
				s[i] = 1/i;
				System.out.println(s[5]);
			}
		} catch (ArrayIndexOutOfBoundsException arrE) {
			System.out.println(arrE.toString());
		} catch (ArithmeticException aE) {
			aE.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("End");
	}
}
