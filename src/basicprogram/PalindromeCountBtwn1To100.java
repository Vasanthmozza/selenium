package basicprogram;

public class PalindromeCountBtwn1To100 {

	public static void main(String[] args) {
		int c=0;
		for (int n = 1; n <= 100; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
			}
			if (n == j) {
		c++;
			}
	

	}System.out.println(c);

}}
