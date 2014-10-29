public class Main {

	public static void main(String[] args) {
		
		Tester test = new Tester();
		
		try {
			test.basicEnqueue();
			test.basicDequeue();
		} catch (QueueFullException e) {
			e.printStackTrace();
		}

		
		
	
		
		
	}

	private static void test() {
		

		
	}
}
