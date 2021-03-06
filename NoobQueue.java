package javafourquestions;

public class NoobQueue {
	
	int myQ[] = new int[20];
	int size;
	int start;
	int end;
	
	public void adding( int value) {
		if (!isFull()) {
			myQ[end] = value;
			end = end +1;
			size = size +1;
		}
		else {
			System.out.println("Queue is full");
		}
	}
	public int removing() {
		int data = myQ[start];
		
		if(!isEmpty()) {
		 	for (int i = 0; i<=size ; i++) {
		 		if(i != size) {
		 		myQ[i] = myQ[i+1];
		 		}
		 		else {
		 			size = size - 1;
		 		}
		 	}
		 	size = size - 1;
		}
		else {
			System.out.println("Queue is Empty");
		}
		return data;
	}
	
	
	public void display () {
		if (size == 0) {
			System.out.println("Queue is Empty");
		}
		else {
		for (int i = 0; i < size; i++) {
			
			System.out.print("Current queue is " + myQ[start+i] + " ");
		}
		System.out.println("\n");
		}
	}
	
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == 5;
		
	}
}
