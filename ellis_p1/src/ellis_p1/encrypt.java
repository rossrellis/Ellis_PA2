package ellis_p1;
import java.util.Scanner;

public class encrypt {
	
	public void Encrypt() { 
		Scanner scnr = new Scanner(System.in);
	      int input, dig1,dig2,dig3,dig4,temp;
	      
	      System.out.print("Enter a four digit number:");
	      input = scnr.nextInt();
	      dig1 = input / 1000;
	      dig2 = (input / 100) % 10;
	      dig3 = (input / 10) % 10;
	      dig4 = input % 10;
	      
	      dig1 = (dig1 + 7) % 10;
	      dig2 = (dig2 + 7) % 10;
	      dig3 = (dig3 + 7) % 10;
	      dig4 = (dig4 + 7) % 10;

	      
	      temp = dig1;
	      dig1 = dig3;
	      dig3 = temp;
	      
	      temp = dig2;
	      dig2 = dig4;
	      dig4 = temp;
	      
	      System.out.printf("Encrypted: %d%d%d%d\n",dig1,dig2,dig3,dig4);
	      decrypt num = new decrypt();
	      
	      num.decryption(dig1,dig2,dig3,dig4,temp);
	      
	}
}