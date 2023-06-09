package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

//break와continue 문제 
//준비사항) res/exam.list 파일에 국어 성적을 다음처럼 저장한다.
//30 49 38 49 50 80 90 100 70 50 60 74 50 33 50 65 76 69

//문제 0)파일에서 모든 성적을 읽어서 다음처럼 화면에 출력하시오
//30, 49, 38, 49, 50, 80, 90, 100, 70, 50, 60, 74, 50, 33, 50, 65, 76, 69,

//문제 1)파일에서 성적을 5번째 까지만 읽어서 다음처럼 화면에 출력하시오
//30, 49, 38, 49, 50, 

//문제 2) 파일에서 성적을 5번부터 읽어서 다음처럼 화면에 출력하시오.
//50, 80, 90, 100, 70, 50, 60, 74, 50, 33, 50, 65, 76, 69,

//문제 3) 파일에서 성적을 읽다가 100점을 만나면 그 이후의 성적을 모두 출력하시오. 

//문제 4) 파일에서 성적을 읽다가 100점을 만나면 그 이후의 성적을 모두 출력하시오.(100미포함)

//문제 5) 파일에서 성적을 다가 두 번째 100점 이후의 성적을 모두 출력하시오. (100점 미포함) 33 50 65 76 69 

//문제 6) 파일에서 성적을 5번부터 8번째 까지만 읽어서 다음처럼 화면에 출력하시오.50, 80, 90, 100  


public class BreakContinue {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);


		
		

 		for (int i=0; fscan.hasNext();i++) {

 			String word = fscan.next();
 			int kor = Integer.valueOf(word);
 			
 			if(i<4) // 0, 1, 2, 3, 4
 				continue;
 			
 			if(i>9) //0 1 2 3 4 5 6 7 8
 				break;
 			
 			System.out.printf("%d, ",kor);
 			
			}
			
		fscan.close();
		fis.close();

		}

		
	}


