package com.newlecture.app.ex9.struct;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {

        int kor;
        int eng;
        int math;

        //성적 로드
        Exam[] exams = new Exam[20];
        {
            FileInputStream fis = new FileInputStream("JavaPrj/res/exam.data");
            Scanner fscan = new Scanner(fis);

            fscan.nextLine();

            int index=0;
            while(fscan.hasNextLine()) {
                Exam exam = new Exam();

                String line = fscan.nextLine(); //"80,90,95"
                String[] tokens = line.split(",");//"80,90,95" -> "80" "90" "95"

                exam.kor = Integer.parseInt(tokens[0]);
                exam.eng = Integer.parseInt(tokens[1]);
                exam.math = Integer.parseInt(tokens[2]);

                exams[index] = exam;
                index++;
            }
            fscan.close();
            fis.close();

            //성적 출력
            {
                for(int i=0;i< index;i++) {
                        System.out.printf("%d ", exams[i].kor);
                        System.out.printf("%d ", exams[i].eng);
                        System.out.printf("%d\n", exams[i].math);
                }
            }
        }// 성적 로드
    }//end main
}//end class
