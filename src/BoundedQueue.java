public class BoundedQueue {
	
	private int size;
	private int[] values;
	private int count;
	
	/*
	 * BoundedQueue Constructor
	 * @param size: initializes bounded size on the queue
	 * 
	 * Sets the initial element count to 0
	 */
	public BoundedQueue(int size) {
		this.size = size;
		values = new int[size];
		count = 0;
	}
	
	/*
	 * enqueue(int element) :=
	 * @param element: new element into the queue
	 * @return N/A
	 * 
	 * Takes in an integer and stores it at the end of the queue.
	 * Checks if the queue is full and throws QueueFullException
	 */
	public void enqueue(int element) throws QueueFullException {
		
		/* Checking if the BoundedQueue is full */
		if (count == size) {
			throw new QueueFullException();
		} else {
			
			values[count] = element;
			++count;
			
		} 
	}
	
	/*
	 * dequeue() :=
	 * @param N/A
	 * @return int of the element removed
	 * 
	 * Returns the first number in the queue
	 * Checks if the queue is empty and throws QueueEmptyException
	 */
	public int dequeue() throws QueueEmptyException {
		
		/* Checking if the BoundedQueue is empty */
		if (count == 0) {
			throw new QueueEmptyException();
		} else {
			
			int returnVal = values[0];
			
			/* Shift indices down to stay 0-based */
			for (int i = 0; i < 4; i++)
				values[i] = values[i+1];
			
			--count;
			
			return returnVal;
			
		}
	}
	
	/*
	 * print() :=
	 * @param N/A
	 * @return N/A
	 * 
	 * Prints the queue for debugging/testing purposes
	 */
	public String print() {
		String queue = "";
		for (int i = 0; i < count; i++) 
			queue += Integer.toString(values[i]) + " " ;
		return queue.trim();
	}
	
}
