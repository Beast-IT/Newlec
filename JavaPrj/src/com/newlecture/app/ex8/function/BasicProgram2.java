package com.newlecture.app.ex8.function;

public class BasicProgram2 {
    static int sum(int n){
       int total=(n*(n+1))/2;
        return total;
    }
    public static void main(String[] args) {
//        int result = 1+2+3+4+5+6+7+8+9+10~n;
        int result=sum(73738);

        System.out.printf("result : %d\n",result);
    }
}
