package com.newlecture.app.ex11.oop.basic;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Exam exam = new Exam();

        exam.input();

        int total=exam.total();
        float avg = exam.avg();
        exam.save("exam.data");
        exam.load("exam.data");

        exam.print();







//exam.kor=4;//private을 사용해서 캡슐화가 깨지는것 방지.
//        exam.aa = 20;//잘못된 static 접근 방법
//        Exam.aa = 100;//올바른 static 접근 방법
//        System.out.printf("전역 변수 : %d\n", Exam.aa);


//        Exam.input(exam);//static Method
//        System.out.printf("Static Method end : %d\n", exam.eng);
//
//        exam.input();//instance Method
//        System.out.printf("Instance Method eng : %d\n", exam.eng);
//        exam.print();

//        System.out.println();

    }

}
