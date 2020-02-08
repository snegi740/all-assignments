package javafourquestions;

	//make class final
	//make all data members final
	//make a parameterised constructor
	//only getters and no setters

public final class MakeImmutable {
	
	final int var1;
	final String name;
	
	public MakeImmutable(String name, int var1) {
		
		this.name = name;
		this.var1 = var1;
	}
	
	public String mygetter1() {
		return name;
	}
	public int mygetter2() {
		return var1;
	}
	
	
	
	
}
	