package com.newlecture.app.ex18.oop.inter;

import java.util.Scanner;

public class ExamConsole {

    private PrintListener printListener;

    public void setPrintListener(PrintListener printListener) {
        this.printListener = printListener;
    }

    private Exam exam;// Association has a 관계

    public Exam getExam() {
        return exam;
    }

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

        printListener.printBanner();

        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath();

        System.out.printf("kor : %d\n", kor);
        System.out.printf("eng : %d\n", eng);
        System.out.printf("math : %d\n", math);
        printListener.printEx();
    }

//    protected abstract void printEx();

//    protected void printBanner() {
//        System.out.println("┌───────────────────────────┐");
//        System.out.println("         성적 출력     ");
//        System.out.println("└───────────────────────────┘");
//        System.out.println();
//    }
}
