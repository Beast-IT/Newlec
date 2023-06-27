package 방과후연습용.Jin;

import java.io.FilterOutputStream;

public class Ex_0627 {
    public static void main(String[] args) {
        //✏️ Java 함수의 기본 형태를 코드로 적어보세요.
        // byte, short, int, long
        // float, double
        // char
        // boolean

        // ✏️ sum이라는 함수가 있을 때, “sum();”을 뭐라고 읽어야 할까요? -> sum을 호출하다.
        // ✏️ sum이라는 함수가 있을 때, “sum을 호출하다”를 코드로 어떻게 작성해야할까요?
        // sum();

        //✏️ int형 변수 x, y를 인자로 받아 x, y 값을 더하여 리턴하는 함수를 선언하여 사용해보세요.

        System.out.println(plus(3,6));

        //✏️ int형 변수 x, y를 인자로 받아 x, y 값을 곱하여 리턴하는 함수를 선언하여 사용해보세요.

        System.out.println(multiple(7,4));
    }
    static int plus(int a,int b){
        return a+b;
    }
    static int multiple(int a,int b){
        return  a*b;
    }
}
