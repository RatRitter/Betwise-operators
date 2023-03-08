import java.util.Scanner;

public class Java09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("m= ");
		int m = sc.nextInt();
		System.out.println("n= ");
		int n = sc.nextInt();
		if (n * m > 0) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}sc.close();}}


