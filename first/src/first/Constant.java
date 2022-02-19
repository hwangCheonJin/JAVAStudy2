package first;

public class Constant {

	public static void main(String[] args) {
		int i;
		i = 5;
		
//		상수는 항상 대문자로 사용한다.
//		변치않는 값을 사용할때 상수를 사용한다
		final int J;
		J = 10;
		
//		J = 5;
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
		final int OIL_PRICE = 1450;
//		상수는 두단어 이상이 사용될때 언더바를 사용한다.
		
		int totalPrice = 50 * OIL_PRICE;
		System.out.println(J);
		System.out.println(circleArea);
		System.out.println(totalPrice);
	}

}
