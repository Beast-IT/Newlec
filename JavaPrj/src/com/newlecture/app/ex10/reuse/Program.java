package com.newlecture.app.ex10.reuse;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws IOException {
        ExamList list = new ExamList();

        ExamList.examLoad(list);
        ExamList.examPrint(list);
    }
}
