package com.davidzhu.kpcb;

public class Main {

	public static void main(String[] args) {
		BoundedQueue q = new BoundedQueue(5);
		for (int i = 1; i < 6; i++) {
			try {
				q.enqueue(i);
				System.out.println(q.print());
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		
		
	}
}
