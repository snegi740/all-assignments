package javafourquestions;

import java.util.*;

public class Removing {

    public static void main(String[] args) {
    	
    	//in this program we don't take input from users
        
        List<Integer> originalArray = new ArrayList<>();

        // Adding new elements to the ArrayList
        originalArray.add(1);
        originalArray.add(2);
        originalArray.add(3);
        originalArray.add(1);
        originalArray.add(4);
        

        System.out.println("This is the arraylist" + originalArray);
        
        //taking a set and putting all values of arraylist into the set
        Set<Integer> s = new HashSet<Integer>();
        
        s.addAll(originalArray);
        
        System.out.println("After removing duplicates" + s);
        
        


    }
}

