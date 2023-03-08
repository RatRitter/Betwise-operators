import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int N = sc.nextInt();
		System.out.println("Enter a bit: ");
		int i = sc.nextInt();
		System.out.printf(Integer.toBinaryString(i), N | 1 << i);
		
sc.close();
	}

}
