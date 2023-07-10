package com.newlecture.app.ex17.oop.abst.custom;

public class Program {
    public static void main(String[] args) {

        Exam exam = new NewExam(1, 2, 3, 4);

        ExamConsole console = new NewExamConsole();

        console.setExam(exam);
        console.print();

        console.printEx();//자식에게 쓰게만 한것임. protected
        //추상화로 틀을 만들면 자식을 위한 것이여서 protected를 많이 씀.
        //같은 패키지에서는 오류 안남. 다른패키지면 오류남.
    }
}