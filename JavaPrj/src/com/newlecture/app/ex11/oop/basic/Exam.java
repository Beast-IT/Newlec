package com.newlecture.app.ex11.oop.basic;

public class Exam {
    static int aa;//전역변수도 private을 사용할 수 있다.
    //전역변수(객채가 여러번 만들어져도 딱 한번 생성되고 끝)이미 있는것임.
    //객체를 생성해서 사용하는것이 아니라 바로 사용하는 것!
    private int kor;
    private int eng;
//    int eng=2; error -> Exam을 new하기 전까지는 공간이 없다.
     private int math;

     //인스턴스 생성시 초기화진행. 생성자 매개변수 버전
     //생성자 오버로드
    public Exam(){//객체의 초기화(이름이 없어서 여러번 호출 할 방법이 없음)
         //this.kor=3;//사용한 적이 없어야 한다.
         this(3,4,5);//이름이 없기때문에 this를 사용한다.
     }
    public Exam(int kor,int eng, int math){//객체의 초기화(이름이 없어서 여러번 호출 할 방법이 없음)
        this.kor =kor;
        this.eng = eng;
        this.math= math;
    }


    public static void input(Exam exam){
        exam.kor=100;
        exam.eng=100;
        exam.math=100;
    }
    public void input(){
        int kor =10;//같은 변수 이름이 있으면 지역변수가 우선시 된다.
        // (지역변수와 맴버변수를 구별하기위해 this사용)

        this.kor=30;// exam이라는 객체에 this(=exam)라는 방에 kor에 넣음.
        this.eng=20;// this는 생략가능하다.
        math=100;
    }

    public void print() {
        System.out.printf("kor : %d, eng : %d, math : %d\n",kor,eng,math);
    }
}// end class
