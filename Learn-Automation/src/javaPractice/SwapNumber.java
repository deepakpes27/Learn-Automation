package javaPractice;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20, y=30;
		System.out.println("x before swaping " + x);
		System.out.println("y before swaping " + y);
		x= x+y;
		y=x-y;
		x=x-y;
		System.out.println("x after swaping "+ x);
		System.out.println("y after swaping " + y);
	}

}
