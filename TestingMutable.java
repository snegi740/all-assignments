package javafourquestions;

public class TestingMutable {
	
	public static void main (String[] args) {
		MakeImmutable s1 = new MakeImmutable("Sagar", 100);
		
		System.out.println("Name is " + s1.mygetter1());
		System.out.println("IQ is " + s1.mygetter2());
		
	}

}
