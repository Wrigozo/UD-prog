package page_rank;
import java.util.*;

public class Main {
	static void kiir(double tomb[], int db)
	{

		for(int i = 0; i < db; i++)
		{
			System.out.println("Page rank: "+tomb[i]+"\n");
		}
	}

	 static double tavolsag(double PR[], double PRv[], int n)
	{

		double osszeg = 0;
		for (int i = 0; i < n; ++i)
		{
			osszeg += (PRv[i] - PR[i]) * (PRv[i] - PR[i]);
		}

			  return Math.sqrt(osszeg);

	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  double L[][] = {
		    {0.0, 0.0, 1.0 / 3.0, 0.0},
		    {1.0, 1.0 / 2.0, 1.0 / 3.0, 1.0},
		    {0.0, 1.0 / 2.0, 0.0, 0.0},
		    {0.0, 0.0, 1.0 / 3.0, 0.0}
		  };

		  double PR[] = {0.0, 0.0, 0.0, 0.0};
		  double PRv[] = {1.0 / 4.0, 1.0 / 4.0, 1.0 / 4.0, 1.0 / 4.0};

		  int i,j;

		  for(;;){

		    for(i = 0; i < 4; ++i){
		      PR[i] = 0.0;
		      for( j = 0; j < 4; ++j){
		        PR[i] += (L[i][j] * PRv[j]);
		      }
		    }

		    if (tavolsag(PR, PRv, 4) < 0.0000000001){
		      break;
		    }

		    for(i = 0; i < 4; ++i){
		      PRv[i] = PR[i];
		    }

		  }

		  kiir(PR, 4);

		

		
	}

}
