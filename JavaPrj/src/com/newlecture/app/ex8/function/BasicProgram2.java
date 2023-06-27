package com.newlecture.app.ex8.function;

public class BasicProgram2 {
    static int sum(int n){
       int total=(n*(n+1))/2;
        return total;
    }
    static int power(int x){
        return ((x+3)*(x+3)+ x/3*(x-2)+5);
    }
    public static void main(String[] args) {
        //int result = 1+2+3+4+5+6+7+8+9+10~n;
        int result = sum(11);
        System.out.printf("result : %d\n",result);

        //(x+3)*(x+3)+ x/3*(x-2)+5
        int result2 = power(7)+3+power(7)-power(3);
        System.out.printf("result : %d\n",result2);

    }
}
