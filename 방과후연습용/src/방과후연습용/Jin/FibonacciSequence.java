package 방과후연습용.Jin;

public class FibonacciSequence {

	public static void main(String[] args) {
//✏️ (심화) 주어진 3개의 변수를 이용하여 다음과 같은 결과를 출력하세요. (출력 숫자는 10개입니다.)
//주어진 변수 -> int x =1, int y=0, int z=0
//결과 값 -> 1 1 2 3 5 8 13 21 34 55		
		
		int x=1;
		int y=0;
		int z=0;
		
			System.out.println(x);
		for(int i=0;i<3;i++) {
			z=x+y;//z=1
			System.out.println(z);
			y=z+x;//y=2
			System.out.println(y);
			x=y+z;//x=3
			System.out.println(x);
		}
		
	}

}
