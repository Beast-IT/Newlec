package com.newlecture.app.ex4_text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// students1.txt 파일에 저장된 학생 이름들을 읽어서 성을 제외한 이름을 students1-out.data 파일에 저장하시오.
		// 단. 파일에 저장된 학생의 수는 5명이다.
		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		// { } 이 지역에서만 쓸수 있게 해준다.(지역화)
		// 좋은 코드는 코드를 유지 관리하기 편한 코드가 좋은 코드이다.
	
		
		//hasNext로 while문 중단 
		while(fscan.hasNextLine())
		{
			
			String line = fscan.nextLine();
			//String name = line.substring(1, 3);
			fout.print(line);
			
			//개행추가 방지 조건문
			if(fscan.hasNextLine())
				fout.println();
			
		}
		

		fout.close();
		fos.close();

		fscan.close();
		fis.close();

		System.out.println("작업 완료");
	}
	
}
