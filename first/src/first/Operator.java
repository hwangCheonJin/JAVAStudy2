package first;

public class Operator {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
//		변수 앞 +부호는 부호비트를 유지, -는 부호비트를 반대로 바꿔준다.
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3;	// i3 = i3+1;
		System.out.println(i4);
		System.out.println(i3);
		int i5 = i3++;	// i3 = i3 + 1;
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / (double)j);
//		둘중 하나의 값이 실수값이여야 실수단위로 출력된다.(강제 형변환)
		System.out.println(i % j);
	}

}
