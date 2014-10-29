public class Tester {

	public void basicEnqueue() throws QueueFullException {
		
		BoundedQueue q = new BoundedQueue(5);
		
		for (int i = 1; i < 6; i++) 
			q.enqueue(i);
		
		
		System.out.print("BoundedQueue q contents: " + q.print() + "");
		
	}

	public void basicDequeue() {
		
	}

}
