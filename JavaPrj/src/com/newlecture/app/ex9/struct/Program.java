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
        {
            FileInputStream fis = new FileInputStream("JavaPrj/res/exam.data");
            Scanner fscan = new Scanner(fis);

            fscan.nextLine();

            Exam exam = new Exam();
            String line = fscan.nextLine(); //"80,90,95"
            String[] tokens =line.split(",");//"80,90,95" -> "80" "90" "95"

            exam.kor=Integer.parseInt(tokens[0]);
            exam.eng=Integer.parseInt(tokens[1]);
            exam.math=Integer.parseInt(tokens[2]);

            fscan.close();
            fis.close();

            System.out.println(exam.kor);
            System.out.println(exam.eng);
            System.out.println(exam.math);


        }

    }//end main
}//end class
