package com.newlecture.app.ex11.oop.hasa;

import java.util.Scanner;

public class ExamConsole {
    private Exam exam = new Exam();// has a 상속관계/ A(ExamConsole)가 B(Exam)를 가지고 있다.

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
