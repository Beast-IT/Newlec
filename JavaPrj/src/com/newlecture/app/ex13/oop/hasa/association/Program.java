package com.newlecture.app.ex13.oop.hasa.association;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        //부품을 만들어줘야함
        Exam exam = new Exam();
        //일체형만 만드려면 밑에처럼 하면 된다.
        ExamConsole console = new ExamConsole();

        //부품을 결함시켜주는 과정
        //setter Injection
        console.setExam(exam);

        console.input();
        console.print();

    }
}
