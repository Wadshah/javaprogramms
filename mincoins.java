import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class mincoins{
	public static void main(String[] arg){
    int cash,sum;
    Scanner sc = new Scanner(System.in);
    cash=sc.nextInt();
    sum=cash/100;
    cash=cash%100;
    sum+=(cash/50);
    cash=cash%50;
    sum+=(cash/10);
    cash=cash%10;
    sum+=(cash/5);
    cash=cash%5;
    sum+=(cash/2);
    cash=cash%2;
    sum+=(cash/1);
    cash=cash%1;
    System.out.println(sum);
}


 	}