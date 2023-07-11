package com.newlecture.app.ex18.oop.inter;

public class NewExam extends Exam /*implements PrintListener*/{
    private int com;


    //하위클래스의 초기화
    public NewExam() {
        this(0, 0, 0, 0);
    }

    //하위클래스의 초기화
    public NewExam(int kor, int eng, int math, int com) {
        super(kor, eng, math);
        this.com = com;
    }

    @Override
    public int total() {
        return super.total() + this.com;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public float avg() {
        return total() / 4.0f;
    }

//    @Override
//    public void printBanner() {
//        System.out.println("뉴렉 고등학교 성적표");
//    }
//
//    @Override
//    public void printEx() {
//        System.out.printf("com : %d",com);
//
//    }
}
