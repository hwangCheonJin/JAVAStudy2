package first;

public class Switch {

	public static void main(String[] args) {
//		switch, case, default, break
		int value = 2;
//		break문이 없으면 순차적으로 시행된다.
		switch(value) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :
				System.out.println("그 외 다른 숫자");
		}
		String str = "A";
		switch(str) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		}
	}

}
