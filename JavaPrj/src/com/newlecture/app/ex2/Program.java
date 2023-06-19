package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Program {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("res/data1.txt");
		// PrintStream fout = new PrintStream(fos,true,"UTF-8");
		PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		// fout2.write("하하 문자열 전문 Write");

		fout2.print("Hello");
		fout2.print(1928273747378L);
		fout2.print("안녕하세요");
		System.out.print("Hello");
		System.out.print(1928273747378L);
		System.out.print("안녕하세요");

		fout2.close();// 나중에 만것을 먼저 닫는다.
		fos.close();
		// txt파일로 나오는 값은 키코드 값이 나온다.(ASCII Code)

		System.out.print("안녕~?");
	}

}
