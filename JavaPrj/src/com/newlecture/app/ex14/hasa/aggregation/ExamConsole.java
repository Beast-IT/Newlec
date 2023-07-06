package com.newlecture.app.ex14.hasa.aggregation;

import java.util.Scanner;

public class ExamConsole {
    private Exam[] exams;
    private int index;

    public ExamConsole() {
        int max = 3;
        exams = new Exam[max];
        index = 0;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        int kor;
        int eng;
        int math;

        System.out.print("kor : ");
        kor = scan.nextInt();

        System.out.print("eng : ");
        eng = scan.nextInt();

        System.out.print("math : ");
        math = scan.nextInt();

        Exam exam = new Exam();
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);

        exams[index++] = exam;
    }

    public void print(int i) {
        Exam exam = exams[i];

        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath();

        System.out.printf("\nkor : %d, eng : %d, math : %d\n", kor, eng, math);

    }

    public void printAll() {
        System.out.println("성적 목록");

        int size = index;
        for (int i = 0; i < size; i++)
            print(i);
    }
}
