
public class Methrow {
	public static void main(String[] args) {
		try {
			Methrow.test("h");
		} 
			catch (InterruptedException e) {
			System.out.println("test1");
		}
	}

	static void test(String s)  throws InterruptedException {
		if ("h" == s) 
		{
			throw new InterruptedException("test3");
		}
		System.out.println("test2");
	}

}
