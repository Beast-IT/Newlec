package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

//break와continue 문제 
//준비사항) 
//res/exam.list 파일에 국어 성적을 다음처럼 저장한다.
//30 49 38 49 50 80 90 100 70 50 60 74 50 33 50 65 76 69

//문제 0)파일에서 모든 성적을 읽어서 다음처럼 화면에 출력하시오
//30, 49, 38, 49, 50, 80, 90, 100, 70, 50, 60, 74, 50, 33, 50, 65, 76, 69,

//문제 1)파일에서 성적을 5번째 까지만 읽어서 다음처럼 화면에 출력하시오
//30, 49, 38, 49, 50, 

public class BreakContinue {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		
		FileOutputStream fos = new FileOutputStream("res/exam_out.list");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
		int index =1;
		
		//문제 0
		while(fscan.hasNext())
		{
			
			String word =fscan.next();
			int kor = Integer.valueOf(word);			
			System.out.printf("%d, ",kor);//콘솔에 출력하기.
			fout.printf("%d, ",kor);//파일에 출력하기.
			
			
			//문제 1 
			if(index==5)
				break;

			index++;
		}
		
		
		fout.close();
		fos.close();
		
		fscan.close();
		fis.close();
		
	}

}
