import java.io.*;
import java.util.*;
public class  RoadTaxCalc {

	public static void main(String[] args) {
		int Price=20000;
		
		Scanner state = new Scanner(System.in);
		System.out.println("Select a state: KA, TN, KL, TS, AP, DL" );
		String st= state.next(); 
		switch (st) {
		case "KA": 
			float KAtax=Price*0.18f;
			System.out.println("KA tax is:"+KAtax);
			break;
		case "TN": 
			float TNtax=Price*0.25f;
			System.out.println("TN tax is:"+TNtax);
			break;
		case "KL": 
			float KLtax=Price*0.24f;
			System.out.println("KL tax is:"+KLtax);
			break;
		case "TS": 
			float TStax=Price*0.12f;
			System.out.println("TS tax is:"+TStax);
			break;
		case "AP": 
			float APtax=Price*0.22f;
			System.out.println("AP tax is:"+APtax);
			break;
		case "DL": 
			float DLtax=Price*0.13f;
			System.out.println("DL tax is:"+DLtax);
			break;
		}
		
	
	}
}