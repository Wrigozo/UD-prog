import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner be=new Scanner(System.in);
		System.out.print("Kérem adja meg a születési dátumát!(\"yyyy.mm.dd\"):\n");
		String szuletesi_datum=be.nextLine();
		
		String nap;
		String szulinap_in_3000="3000.";
		String b= szuletesi_datum.substring(5,10);
		szulinap_in_3000= szulinap_in_3000.concat(b);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");
		Date d = sdf.parse(szulinap_in_3000);
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		
		int a=gc.get(Calendar.DAY_OF_WEEK);
		
		switch (a) {
		case 5:
			nap="vasárnapra";
			break;
		case 6:
			nap="hétfőre";
			break;
		case 7:
			nap="keddre";
			break;
		case 1:
			nap="szerdára";
			break;
		case 2:
			nap="csütörtökre";
			break;
		case 3:
			nap="péntekre";
			break;
		case 4:
			nap="szombatra";
			break;
		default:
			nap="nem tudom";
			break;
		}
		System.out.print("A szülinapod 3000-ben "+nap+" esik.\n");
		}
		catch(Exception e){}
	
	}

}
