package com.newlecture.app.ex13.oop.hasa.association;

import java.util.Scanner;

public class ExamConsole {
    //이용하기는 하는데 부품이 빠져있는 관계
    //Association has a 관계
    //private Exam exam;
    private Exam exam;// Association has a 관계
    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath();

        System.out.print("kor : ");
        kor = scan.nextInt();

        System.out.print("eng : ");
        eng = scan.nextInt();

        System.out.print("math : ");
        math = scan.nextInt();
    }

    public void print() {

        exam.setKor(100);
        exam.setEng(90);
        exam.setMath(50);

        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath();

        System.out.printf("kor : %d, eng : %d, math : %d\n", kor, eng, math);
        System.out.printf("total : %d\n", exam.total());
        System.out.printf("avg %.2f\n", exam.avg());

    }

}
