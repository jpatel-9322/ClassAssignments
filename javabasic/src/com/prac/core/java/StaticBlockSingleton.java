package com.prac.core.java;

public class StaticBlockSingleton {
 
	    public static void main(String a[]){
	        MySingleton ms = MySingleton.getInstance();
	        ms.testSingleton();
	        MySingleton ms1 = MySingleton.getInstance();
	        
	        if(ms == ms1){
				System.out.println("Same object");
			}else{
				System.out.println("Not Equal");
			}
	        
	    }
	}
	 
	class MySingleton{
	     
	    private static MySingleton instance;
	     
	    static
	    {
	        instance = new MySingleton();
	    }
	     
	    private MySingleton()
	    {
	        System.out.println("Creating MySingleton object...");
	    }
	     
	    public static MySingleton getInstance(){
	        return instance;
	    }
	     
	    public void testSingleton()
	    {
	        System.out.println("Hey.... Instance got created...");
	    }
	}

