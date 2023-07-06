package com.newlecture.app.ex15.oop.isa;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        NewExam exam =new NewExam();
        exam.setKor(10);
        exam.setEng(20);
        exam.setMath(30);
        exam.setCom(40);

        int total = exam.total();

        System.out.printf("Total is : %d\n",total);

//        ExamConsole console = new ExamConsole();
//
//        console.input();
//        console.input();
//        console.input();
//
//        //console.print(2);
//        console.printAll();

    }

}
