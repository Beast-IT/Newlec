package com.newlecture.app.ex1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("res/data.txt");

		fout.write(40);// fout 이라는 객체에 '30'을 입력함.
		fout.write(65);// 'A' 아스키코드
		fout.write(50);// '2' 아스키코드
		fout.write(100);// 'd' 아스키코드
		fout.write('9');// 문자 9
		fout.write(57);// 숫자 9
		fout.flush();// 버퍼에 있는 값을들 보냄!!입력받은 값을 보내버림!

		fout.close();// 버퍼에 있는 것을 버림!

		// txt파일로 나오는 값은 키코드 값이 나온다.(ASCII Code)

		char st = '0';
		System.out.println(st + 1);
		System.out.println(st + 2);
		System.out.println(st + 3);
		System.out.println(st + 4);
		

	}

}
