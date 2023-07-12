package com.newlecture.app.ex18.oop.inter;

import java.util.Scanner;

public class ExamConsole {

    private PrintListener printListener;
    private BannerPrint bannerPrint;
    private ExPrinter exPrinter;

    public void setBannerPrint(BannerPrint bannerPrint) {
        this.bannerPrint = bannerPrint;
    }

    public void setExPrinter(ExPrinter exPrinter) {
        this.exPrinter = exPrinter;
    }

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

        //조건처리!(printListener가 사용되지 않으면 에러뜸)
        //그래서 이렇게 조건 처리해줌
        if (bannerPrint != null)
            bannerPrint.printBanner();
        else if (printListener != null)
            printListener.printBanner();

        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath();

        System.out.printf("kor : %d\n", kor);
        System.out.printf("eng : %d\n", eng);
        System.out.printf("math : %d\n", math);

        if (exPrinter != null)
            exPrinter.printEx();
        else if (printListener != null)
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
