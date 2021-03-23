
public class Problem2 {

	public static void main(String[] args) {
		String s1 = "47";
		System.out.println("reverse binary of 47 is: " + BinaryReversal(s1));
	}

	public static String BinaryReversal(String str) {
		int num = Integer.parseInt(str);
		int rev = 0;
		String s = Integer.toBinaryString(num);
		while(s.length() % 8 != 0)
			s = "0" + s;			
		for(int i = s.length()-1; i >= 0; i--) {
			int curBit = s.charAt(i) - '0';
			rev <<= 1;
			if((curBit&1) == 1)
				rev ^= 1;
		}
		return String.valueOf(rev);
	}
}
