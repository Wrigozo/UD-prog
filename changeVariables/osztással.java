package valtcsere;

import java.util.*;
public class osztással {


		public static void main(String[] args)
		{
			// TODO Auto-generated method stub

			Scanner be=new Scanner(System.in);
			System.out.print("Kérem az 'a' számot!\n");
			double a=be.nextDouble();
			System.out.print("Kérem a 'b' számot!\n");
			double b=be.nextDouble();
			
			System.out.printf("Az a változó: %.0f", a);
			System.out.printf(" és a b változó: %.0f", b);
			System.out.println();
			a=b/a;
			b=b/a;
			a=b*a;
			
			
			System.out.printf("Csere: Az 'a' változó: %.0f", a);
			System.out.printf(" és a 'b' változó: %.0f", b);
			
			
		}

	}
