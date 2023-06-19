package 방과후연습용.Jin;

import java.io.Serial;

//✏️for문을 이용하여  다음처럼 구구단 표를 출력해보세요.
//2 * 1 = 2
//2 * 2 = 4
//.
//9 * 9 = 81
public class Ex_0616 {
	public static void main(String[] args) {
		int result =0;
		for (int i = 0; i < 9; i++) {
			if(i==8)
				break;
			for (int j = 0; j < 9; j++) {
				result=(i+2)*(j+1);
				if(result%2!=0)
					System.out.printf("%d * %d = %d\n", i + 2, j + 1, result);
				else 
					continue;
			}
			System.out.println();
		}
	}// end main
}
