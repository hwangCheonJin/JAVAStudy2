package first;

public class If {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		if(x < y) {
			System.out.println("x는 y보다 작습니다.");
		}
		
		if(x == y)
			System.out.println("x는 y와 같습니다");
//		중괄호가 없을때는 한문장만 출력
	
	if(x == y) {
		System.out.println("x는 y와 같습니다.");
	}else if (x < y){
		System.out.println("x와 y보다 작습니다.");
	}else {
		System.out.println("x는 y와 다릅니다.");
	}

}
}