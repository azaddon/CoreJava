package thread;

public class Multithread extends Thread {

	
		
		public void run()
	    {
	        try
	        {
	            // Displaying the thread that is running
	            System.out.println ("Thread " +
	                  Thread.currentThread().getId() +
	                  " is running");
	 
	        }
	        catch (Exception e)
	        {
	            // Throwing an exception
	            System.out.println ("Exception is caught");
	        }
	    }
	
	 
	// Main Class
	
	    public static void main(String[] args)
	    {
	        //int n = 10; // Number of threads
	        for (int i=0; i<2; i++)
	        {
	            Multithread object = new Multithread();
	            object.start();
	        }
	    }
		// TODO Auto-generated method stub

	}


