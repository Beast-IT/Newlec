package com.newlecture.app.ex15.oop.isa;

import java.util.Scanner;

public class ExamConsole {

    private Exam[] exams; // 가질 수 있도록 선언만 되어있고 부품이 빠져있는 상태. association has a
    private int index;

    public ExamConsole() {
        int max = 3;
        exams = new Exam[max];
        index = 0;
    }

    public void input() { // 인스턴스 함수
        Scanner scan = new Scanner(System.in);
        int kor;
        int eng;
        int math;

        System.out.println("kor: ");
        kor = scan.nextInt();
        System.out.println("eng: ");
        eng = scan.nextInt();
        System.out.println("math: ");
        math = scan.nextInt();

        Exam exam = new Exam();
        exam.setKor(kor); // 지역변수를 활용해서 setter처리해주기
        exam.setEng(eng);
        exam.setMath(math);

        exams[index++] = exam;
    }

    public void print(int i) {
        Exam exam = exams[i];
        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath();
        System.out.printf("kor:%d, eng:%d, math:%d\n", kor, eng, math);
    }

    public void printAll() {
        int size = index;
        for (int i = 0; i < size; i++) {

            print(i);

        }
    }

}