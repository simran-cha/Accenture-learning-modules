import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);

	    String str2="15/12/2020";
	    String str1=sc.next();
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    sdf.setLenient(false);
	    Date d1,d2;
	    try{
		d1=sdf.parse(str1);
		d2=sdf.parse(str2);
	}catch(ParseException e) {
		return;
	}
	long time=(d2.getTime() - d1.getTime())/1000/60/60/24/365;
	System.out.println(time+" years");
	}
}
