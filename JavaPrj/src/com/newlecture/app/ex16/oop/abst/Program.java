package com.newlecture.app.ex16.oop.abst;

import com.newlecture.app.ex15.oop.isa.GameFrame;

import java.awt.*;
import java.io.IOException;

public class Program {
    public static void main(String[] args)   {
        //아래 방법이 더 많은 메뉴를 사용할 수 있어서 맞는 방법
        Exam[] exams =new Exam[3];

        exams[0]=new NewExam(10,20,30,40);
        exams[0].total();
        float avg =exams[0].avg();

        System.out.println(avg);



        //Exam보다는 기능이 없다.(" . " 찍으면 기능이 많이 없음)
//        NewExam exam1 = new NewExam();
    }
}