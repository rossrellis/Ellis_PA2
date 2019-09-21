package ellis_p1;

public class decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encrypt encryptObj = new encrypt();
		encryptObj.Encrypt();
		
		
		
		
		
		

	}
	public void decryption(int dig1,int dig2,int dig3,int dig4,int temp) {
	
		

		temp = dig1;
	      dig1 = dig3;
	      dig3 = temp;
	      
	      temp = dig2;
	      dig2 = dig4;
	      dig4 = temp;

	      
	      if(dig1 == dig1){
	    	  if(dig1 >= 7) {
	    		dig1 = dig1 - 7;  
	    	  }
	    	  else {
		    	  dig1 = (dig1 + 10) - 7;
	    	  }
	      }
	      if(dig2 == dig2) {
	    	 if(dig2 >= 7) {
		    	dig2 = dig2 - 7;  

	    	 }
	    	 else {
		    	  dig2 = (dig2 + 10) - 7;
	    	 }
	     }
	      if(dig3 == dig3) {
	    	 if(dig3 >= 7) {
		    		dig3 = dig3 - 7;  

	    	 }
	    	 else {
		    	  dig3 = (dig3 + 10) - 7;
	    	 }
	     }
	       if(dig4 == dig4) {
	    	 if(dig4 >= 7) {
		    		dig4 = dig4 - 7;  

	    	 }
	    	 else {
		    	  dig4 = (dig4 + 10) - 7;
	    	 }
	     }
	    	  
		
	      System.out.printf("Decrypted: %d%d%d%d\n",dig1,dig2,dig3,dig4);

	
	
	}
	

}