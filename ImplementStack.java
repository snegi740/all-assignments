package javafourquestions;

public class ImplementStack {

	    public static void main(String[] args) {
	        NoobStack newStack = new NoobStack(5);
	        newStack.push(1);
	        newStack.push(2);
	        newStack.push(3);
	        newStack.push(4);
	        newStack.push(5);
	      
	        newStack.display();
	        
	        newStack.pop();
	        newStack.pop();
	        newStack.pop();
	        newStack.pop();
	        
	        newStack.display();
	        newStack.pop();
	        newStack.pop();
	}
}
