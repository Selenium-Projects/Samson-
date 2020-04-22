package Javastring;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer num = 2468;
		int reversenum = 0;
		System.out.println("Input your number and press enter: "+num);

		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of input number is: " + reversenum);

	}

}
