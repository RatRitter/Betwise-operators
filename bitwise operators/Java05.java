import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		int n = 0b000101;
		int i = 0;
	
		n &= ~(1 << i);
		System.out.println(Integer.toBinaryString(n));
	}

}
