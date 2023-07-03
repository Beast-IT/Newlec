package 방과후연습용.Jin.Sort;

public class Factorial {
    public static int factorial(int number) {
        if (number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("9 팩토리얼은 " + factorial(9));
    }
}
