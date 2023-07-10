package com.newlecture.app.ex15.oop.isa;

import java.awt.*;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        Frame frame = new GameFrame();
        frame.setVisible(true);
        frame.setBackground(Color.pink);

//        NewExam exam = new NewExam();
//        exam.setKor(10);
//        exam.setEng(20);
//        exam.setMath(30);
//        exam.setCom(40);
//
//        int total = exam.total();
//
//        System.out.printf("Total is : %d\n", total);
//
//        //현재 참조하고 있는 객체 형식의 함수 호출을 우선으로 한다.
//        Exam aa = new NewExam(1,1,1,1);
//        System.out.println(aa.total());

        //NewExam bb = (NewExam) new Exam();



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
