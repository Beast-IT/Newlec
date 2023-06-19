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
			z=x+y;//z에 x(1)+y(0)값을 넣어준다. 결과 : 1
			System.out.println(z);
			y=z+x;//y에 z(1)+x(1) 넣어준다. 결과 : 2
			System.out.println(y);
			x=y+z;//x에 z(1)+y(2) 넣어준다. 결과 : 3
			System.out.println(x);
		}
		
	}

}
