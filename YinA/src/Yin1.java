import java.util.*;

public class Yin1 {

	public static void main(String[] args) {
		int n = 7776777, c=0;
		while (n!=1) {
			c++;
			if ((n%2)==0) {
				n=n/2; 
			} else n=(n*3)+1;
			System.out.println(n);
		}
		System.out.println(c);

	}//Hello domo boku ga koko

}
