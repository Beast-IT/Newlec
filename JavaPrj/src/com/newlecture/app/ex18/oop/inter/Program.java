package com.newlecture.app.ex18.oop.inter;

public class Program {
    public static void main(String[] args) {

        Exam exam = new NewExam(1, 2, 3, 4);

        ExamConsole console = new ExamConsole();
//        PrintListener printListener = new PrintListenerImp();
//        PrintListener printListener = (PrintListener) exam;
//

        //클래스 안에 클래스 만들기
//        class AA implements PrintListener {
//            @Override
//            public void printBanner() {
//                System.out.println("뉴렉 고등학교 성적표");
//            }
//            @Override
//            public void printEx() {
//                NewExam exam1=(NewExam) exam;
//                System.out.printf("com : %d",exam1.getCom());
//            }
//        }

        //익명클래스
//        PrintListener printListener = new PrintListener() {
//            @Override
//            public void printBanner() {
//                System.out.println("뉴렉 고등학교 성적표");
//
//            }
//
//            @Override
//            public void printEx() {
//                NewExam exam1=(NewExam) exam;
//                System.out.printf("com : %d",exam1.getCom());
//            }
//        };

        //바로 넣어버렵!
        console.setPrintListener(new PrintListener() {
            @Override
            public void printBanner() {
                System.out.println("뉴렉 고등학교 성적표");

            }

            @Override
            public void printEx() {
                NewExam exam1=(NewExam) exam;
                System.out.printf("com : %d",exam1.getCom());
            }
        });
        console.setExam(exam);
        console.print();


    }
}