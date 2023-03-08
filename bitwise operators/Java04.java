
public class Java04 {

	public static void main(String[] args) {
		int n = 0b01110;
		int i = 1;
		n ^= (1 << i);
System.out.println(Integer.toBinaryString(n));
	}

}
