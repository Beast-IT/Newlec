package com.newlecture.app.ex18.oop.inter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(3);
        list.add(1);
        list.add(13);
        list.add(96);

        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        list.sort((x,y)->x-y);
        list.sort((x,y)->{
//            Exam ex = x;
//            ex.kor;
            return x-y;});

        //예외처리
        //콜렉션
        //박싱
        //스트림 API

        System.out.println(list);



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

//        익명클래스
        PrintListener printListener = new PrintListener() {
            @Override
            public void printBanner() {
                System.out.println("뉴렉 고등학교 성적표");
            }

            @Override
            public void printEx() {
                NewExam exam1 = (NewExam) exam;
                System.out.printf("com : %d", exam1.getCom());
            }
        };

        //바로 넣어버렵!
//        console.setPrintListener(new PrintListener() {
//            @Override
//            public void printBanner() {
//                System.out.println("뉴렉 고등학교 성적표");
//            }
//            @Override
//            public void printEx() {
//                NewExam exam1=(NewExam) exam;
//                System.out.printf("com : %d",exam1.getCom());
//            }
//        });
        ExPrinter exPrinter = new ExPrinter() {
            @Override
            public void printEx() {
                NewExam exam1 = (NewExam) exam;
                System.out.printf("com : %d", exam1.getCom());
            }
        };

        //Arrow Function;
        BannerPrint bannerPrint =()->{
            System.out.println("뉴렉 고등학교 성적표");
        };

        console.setExPrinter(printListener);
        console.setBannerPrint(()->{
            System.out.println("뉴렉 고등학교 성적표!!!!!");
        });
        console.setExam(exam);
        console.print();
    }
}

