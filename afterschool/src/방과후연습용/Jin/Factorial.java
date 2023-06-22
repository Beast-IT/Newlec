package 방과후연습용.Jin;

public class Factorial {
	public static void main(String[] args) {

		//각 i에 다른 팩토리얼이 저장되는 
		// ex) i = 2 -> 2!
		int temp = 1;

		// 각 팩토리얼이 더해지는 값
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			temp = temp * i;
			sum = sum + temp;
		}
		//각 팩토리얼의 총 
		System.out.println(sum);
	}
}
//sum 
//