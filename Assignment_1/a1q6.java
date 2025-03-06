package assignment1;
	
public class a1q6 {
	public static boolean isodd(int num) {
		return (num&1)!=0;
	}
	public static void main(String args[]) {
		int n=20;
		System.out.print(isodd(n));
	}
}
