import java.util.*;
public class TestClass{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Income:-");
	int income = sc.nextInt();
	int tax;
	if(income < 500000){
		tax = 0;
		System.out.println("0% Tax");
	}
	else if(income >= 500000 && income < 1000000){
		tax = (int)(income * 0.2);
		System.out.println("20% Tax");
	}
	else{
		tax =(int )(income * 0.3);
		System.out.println("30% Tax");
	}
	System.out.println("Your Tax is:"+ tax);
	}
}