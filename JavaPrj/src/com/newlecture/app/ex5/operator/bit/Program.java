package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// 4바이트 데이터 읽기
		int n1, n2, n3, n4;
		int n5, n6, n7, n8;

		{ // FileInputStream 객체 fis를 생성해주시고요. 파일명은 res/pic1.bmp
			FileInputStream fis = new FileInputStream("res/pic1.bmp");
			
			
			
			// 2바이트를 읽어서 버리세요. fis.read();// a byte of data, -1(int) fis.read();

			// 추가로 4바이트는 정수형 변수 n1, n2, n3, n4에 저장해주세요.
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();

			// 각 변수들을 "10, 20, 30, 40"과 같은 포멧으로 콘솔에 출력해주세요.
			System.out.printf("%03d %03d %03d %03d\n", n1, n2, n3, n4);

			boolean x = ((3 > 4) && (5 == 7)) && ((5 - 3 > 7)) || 7 < (2 + 1 * 4);

			fis.close();
		}

		// 파일 크기 출력
		{

			// 255 224 000 016 -> 016 000 224 255

			int size = n1 << 0 | n2 << 8 | n3 << 16 | n4 << 24;

			// 삼항 연산자. " ? : "

			// 가나다라 -> 라 다 나 가
			String result = (size > 10000000) ? "우아크다" : "적당하다";
			size = (size > 100000) ? 0 : size;// 크기를 벗어나거나 유효하지 않은 값일 경우 기본 값으로 대치할 수 있다.

			System.out.println(result);

			// System.out.printf("Size : %d\n", size);

			// [   ][   ][   ][255] (n1<<0 & 0x000000ff)
			// [   ][   ][224][   ] (n2<<8)& 0X0000ff00)
			// [   ][000][   ][   ] (n3<<16& 0X00ff0000)
			// [016][   ][   ][    ] (n4<<24& 0Xff000000)
		}

		// Image Width & Height
		{
			FileInputStream fis = new FileInputStream("res/pic1.bmp");

			fis.read();
			fis.read();

			fis.read();
			fis.read();
			fis.read();
			fis.read();

			fis.read();
			fis.read();
			fis.read();
			fis.read();

			fis.read();
			fis.read();
			fis.read();
			fis.read();

			fis.read();
			fis.read();
			fis.read();
			fis.read();

			// Image Width
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();

			// Image Height
			n5 = fis.read();
			n6 = fis.read();
			n7 = fis.read();
			n8 = fis.read();

			int width = (n1 << 0) & 0x000000ff | (n2 << 8) & 0X0000ff00 | (n3 << 16) & 0X00ff0000
					| (n4 << 24) & 0Xff000000;
			int height = (n5 << 0)& 0x000000ff | (n6 << 8)& 0x000ff00 | (n7 << 16)& 0x00ff0000 | (n8 << 24)& 0xff000000;

			System.out.printf("Width : %d, Height : %d\n", width, height);
			
			

		}

	}

}
