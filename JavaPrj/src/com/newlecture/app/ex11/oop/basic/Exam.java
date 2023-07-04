package com.newlecture.app.ex11.oop.basic;

public class Exam {
    static int aa;
    //전역변수(객채가 여러번 만들어져도 딱 한번 생성되고 끝)이미 있는것임.
    //객체를 생성해서 사용하는것이 아니라 바로 사용하는 것!
    int kor;
    int eng;
    int math;

    public static void input(Exam exam){
        exam.kor=100;
        exam.eng=100;
        exam.math=100;
    }
    public void input(){
        int eng =10;//지역변수가 우선시 된다.
        // (지역변수와 맴버변수를 구별하기위해 this사용)

        this.kor=30;//exam이라는 객체에 this(=exam)라는 방에 kor에 넣음.
        this.eng=20;//this는 생략가능하다.
        math=100;
    }
}// end class
