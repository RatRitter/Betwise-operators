
public class Java06 {

	public static void main(String[] args) {
		
		int i = 0b01101;
		int num = 0b00011;
		num &= (1<<i)-1;
System.out.println(Integer.toBinaryString(num));
	}

}
