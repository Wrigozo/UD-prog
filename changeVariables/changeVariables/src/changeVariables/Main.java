package changeVariables;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner be=new Scanner(System.in);
		System.out.print("K�rem az 'a' sz�mot!\n");
		int a=be.nextInt();
		System.out.print("K�rem a 'b' sz�mot!\n");
		int b=be.nextInt();
		
		System.out.println("Az a v�ltoz�: "+a+" �s a b v�ltoz�: "+b);
		
		a=b-a;
		b=b-a;
		a=b+a;
		
		System.out.println("Csere:\nAz 'a' v�ltoz�: "+a+" �s a 'b' v�ltoz�: "+b);
		
		
	}

}
