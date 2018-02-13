package changeVariables;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner be=new Scanner(System.in);
		System.out.print("Kérem az 'a' számot!\n");
		int a=be.nextInt();
		System.out.print("Kérem a 'b' számot!\n");
		int b=be.nextInt();
		
		System.out.println("Az a változó: "+a+" és a b változó: "+b);
		
		a=b-a;
		b=b-a;
		a=b+a;
		
		System.out.println("Csere:\nAz 'a' változó: "+a+" és a 'b' változó: "+b);
		
		
	}

}
