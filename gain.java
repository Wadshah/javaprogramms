import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class gain{
	public static void main(String[] arg){
		int price ,repair,sp,cp,gain;
		double gainpercent;
		DecimalFormat d= new DecimalFormat("0.00");
		Scanner sc= new Scanner(System.in);
		price  = sc.nextInt();
		repair = sc.nextInt();
		sp= sc.nextInt();
		cp=price+repair;
		gain=sp-cp;
		gainpercent=((double)gain/(double)cp) *100;
		System.out.println(d.format(gainpercent));


	}
}