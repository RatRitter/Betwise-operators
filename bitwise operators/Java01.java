
public class Java01 {

	public static void main(String[] args) {
		int n = 0b01101101;
		int m = 0b00000001;
		System.out.println(Integer.toBinaryString(m));
System.out.println(" ");
		n = n ^ m;
		System.out.println(Integer.toBinaryString(n));
	}

}
