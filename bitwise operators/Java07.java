import java.util.Scanner;

public class Java07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int c = sc.nextInt();
		System.out.println("Enter a bit:");
		int i = sc.nextInt();
		int bit = (c >> i) & 1;
		int bit1 = (c << i) & 1;
System.out.println(Integer.toBinaryString(bit));
sc.close();	}
//нет 1
}
