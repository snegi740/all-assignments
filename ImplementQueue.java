package javafourquestions;

public class ImplementQueue {
	
	public static void main (String[] args) {
		
		NoobQueue q = new NoobQueue();
		
		q.adding(4);
		q.adding(4);
		q.adding(4);
		q.adding(4);
	
		
		q.removing();
		q.adding(5);
		
		q.display();
		
		
		System.out.println("Emptiness of queue is " + q.isEmpty());
		System.out.println("Size " + q.getSize() );
		System.out.println("Fullness of queue is " + q.isFull());
		
	}

}
