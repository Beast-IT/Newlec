package com.newlecture.app.ex9.struct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProgramUsingFunction {

    public static void main(String[] args) throws IOException {
        // 1. ExamList클래스에서 list라는 이름으로 새로운 객체를 만든다.
        //  ExamList클래서 안에 있는 exams[20], index를 다른 클래서에서 list.exams[i], list.index 형식으로 사용가능
        ExamList list = new ExamList();

        //성적로드
        examLoad(list);

        //성적 정렬
        examsort(list);

        //성적 출력
        examPrint(list);
        System.out.println();
        examPrint(list, 3);//Overload(과적) 함수

        int result = sum(10);
        System.out.printf("sum is %d\n", result);

    }//end main

    private static int sum(int n) {//재귀함수.
        if(n==1)
            return  1;

        return n+sum(n-1);

        //선택정렬
        //버블정렬
        //Quick Sort(재귀함수를 이용한 정렬 방법)
    }

//    private static int sum(int n) {
//        int result = 0;
//
//        for (int i = 0; i < n; i++)
//            result = result + (i+1);
//
//        return result;
//    }

    private static void examPrint(ExamList list) {//오버로드 함수
        int size = list.index;//전체내용 출력
        examPrint(list, size);
    }

    private static void examPrint(ExamList list, int limit) {
        Exam[] exams = list.exams;

        int size = limit;

        int num = 1;//성적 등수 확인용 숫자.

        for (int i = 0; i < size; i++) {
            Exam exam = exams[i];
            int kor = exam.kor;
            int eng = exam.eng;
            int math = exam.math;

            int total = exam.total;
            float avg = exam.avg;

//                    if (avg >= 80)//성적 80이상
            System.out.printf("%d등 %3d, %3d, %3d, 총점 %3d 평균 %.2f\n", num, kor, eng, math, total, avg);
            num++;
        }

    }

    private static void examsort(ExamList list) {

        Exam[] exams = list.exams;
        int size = list.index;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - 1 - i; j++)
                if (exams[j].avg < exams[j + 1].avg) {
                    Exam temp = exams[j];
                    exams[j] = exams[j + 1];
                    exams[j + 1] = temp;
                }

    }

    private static void examLoad(ExamList list) throws IOException {

        Exam[] exams = list.exams;
        int index = list.index;

        FileInputStream fis = new FileInputStream("JavaPrj/res/exam.data");
        Scanner fscan = new Scanner(fis);

        fscan.nextLine();

        while (fscan.hasNextLine()) {

            //반복문안에 선언은 여러번 이루어지지 않은.(반복문 들어가기전에 이미 준비해서 들어온다.)
            // " = " 뒤에 있는 new Exam();이 연산자여서 새로운 공간이 반복할때마다 계속 생성되는 것이다.
            Exam exam = new Exam();

            String line = fscan.nextLine(); //"80,90,95"
            String[] tokens = line.split(",");//"80,90,95" -> "80" "90" "95"


            int kor = Integer.parseInt(tokens[0]);
            int eng = Integer.parseInt(tokens[1]);
            int math = Integer.parseInt(tokens[2]);
            int total = kor + eng + math;
            float avg = (float) total / 3.0f;

            exam.kor = kor;
            exam.eng = eng;
            exam.math = math;
            exam.total = total;
            exam.avg = avg;

            exams[index++] = exam;//참조 대입!!!!참조하는 대상이 다르다.!!!! 값 대입 X

            list.exams = exams;
            list.index = index;
        }
        fscan.close();
        fis.close();
    }

}//end class
