package 방과후연습용.Jin;

//✏️for문을 이용하여  다음처럼 구구단 표를 출력해보세요.
//2 * 1 = 2
//2 * 2 = 4
//.
//9 * 9 = 81
public class Ex_0616 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if(i==8)
				break;
			for (int j = 0; j < 9; j++) {
					System.out.printf("%d * %d = %d\n", i + 2, j + 1, (i + 2) * (j + 1));
			}
			System.out.println();
		}
	}// end main
}
