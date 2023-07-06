package com.newlecture.app.ex15.oop.isa;

public class NewExam extends Exam{
    //Has a 부품명
    //Exam exam;
    //

    private int com;

    @Override
    public int total() {
        return super.total()+com;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }
}
