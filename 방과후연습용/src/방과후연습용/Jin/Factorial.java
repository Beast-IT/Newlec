package 방과후연습용.Jin;

public class Factorial {
	public static void main(String[] args) {

		int fac = 1;
		int total = 1;
		int fin = 0;

		for (int i = 0, n = 1; i < 5; i++, n++) {
			total = total * (fac * n);//fac 없어도 가능.
			fin += total;
			System.out.println(total);
		}
		System.out.println(fin);
//total *1 > 
	}
}
