package javafourquestions;

public class NoobStack {
	
    int top;
    int size;
    int[] stack ;

    public NoobStack(int stackCapacity){
        size = stackCapacity;
        stack = new int[size];
        top = -1;
    }

    public void push(int a){
        if(top == size-1){
            System.out.println("The Stack is already full.");
        }
        else{

            top = top+1;
            stack[top] = a;
        }
    }

    public void pop() {
    	
        if(!isEmpty())
            top = top-1;
        	
        else {
            System.out.println("Stack is already Empty.");
        }
    }

    public boolean isEmpty() {                          //empty stack returns -1.
        return top == -1;
    }

    public void display(){

        for(int i=0; i <= top; i++) {
        	
            System.out.print(stack[i]+ " " + "\n");
        }
        System.out.println();
    }
}
