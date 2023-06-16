package 방과후연습용.Jin;
//✏️  while문을 이용하여, number가 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 코드를 작성해보세요.

//		number의 값이 100이 되면 while문을 빠져나와주세요.
//		-+-+-+-+-+... (반복)
public class Ex_0616 {
	public static void main(String[] args) {
		int number = 1;
		while (number <= 100) {
			if ((number % 2) == 0)
				System.out.print("+");
			else
				System.out.print("-");
			number++;
		}
	}
}
