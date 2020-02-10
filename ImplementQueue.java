package javafourquestions;

public class ImplementQueue {
	
	public static void main (String[] args) {
		
		NoobQueue q = new NoobQueue();
		
		int ch;
        do
        {   System.out.println("\n" + "Enter your choice");
            System.out.println("1.To add an element");
            System.out.println("2.To remove first item of queue");
            System.out.println("3.To display your queue");
            System.out.println("4.Exit from this operation ");
            
            ch= new Scanner(System.in).nextInt();
   
            switch(ch)
                {
                    case 1: System.out.println("Enter Integer to add to queue");
                            try {
                            int value=new Scanner(System.in).nextInt();   
                            q.adding(value);
                    		} catch (Exception e) {
                    			System.out.println("Enter an integer");
                    			
                    		}
                            break;
                    case 2: System.out.println("Removing first item of queue");
                            q.removing();
                            break;
                    case 3: 
                            q.display();
                            break;
                    case 4:
                            break;
                    default:
                            System.out.println("Wrong choice");
                }
        }while(ch!=4);
	}

}
