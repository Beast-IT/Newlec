package 방과후연습용.Jin;
//✏️  while문을 이용하여, number가 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 코드를 작성해보세요. 이때, x축의 문자가 10개가 되면, 줄바꿈을 해보세요

//-+-+-+-+-+
//-+-+-+-+-+
//-+-+-+-+-+
//…(반복)

public class Ex_0616 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		while (i < 10) {
			while (j < 10) {
				if ((j + 1) % 2 == 0)
					System.out.print("+");
				else
					System.out.print("-");
				j++;
			}
			System.out.println();
			j = 0;
			i++;
		}
	}
}
