import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		
		  int h = 0;
		  int n = 0x01;
		  do{
			n<<=1;
		    h++;}
		  while (n!=0);
		  System.out.println("A szohossz ezen a gepen: %d bites\n"+h);

		
	}
}
