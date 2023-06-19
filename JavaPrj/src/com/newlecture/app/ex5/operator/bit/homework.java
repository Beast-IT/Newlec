package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;

public class homework {

	public static void main(String[] args) throws IOException {
		// 4바이트 데이터 읽기
		int n1 , n2, n3, n4 ;
		int n5 , n6, n7 , n8 ;

		// 파일 크기 출력
		{

			// 255 224 000 016 -> 016 000 224 255

			// int size = n1 << 0 | n2 << 8 | n3 << 16 | n4 << 24;

			// 삼항 연산자. " ? : "

			/*
			 * 가나다라 -> 라 다 나 가 String result = (size > 10000000) ? "우아크다" : "적당하다"; size =
			 * (size>100000)?0:size;//크기를 벗어나거나 유효하지 않은 값일 경우 기본 값으로 대치할 수 있다.
			 * 
			 * 
			 * System.out.println(result);
			 */

			// System.out.printf("Size : %d\n", size);

			// [ ][ ][ ][255]
			// [ ][ ][224][ ]
			// [ ][000][ ][ ]
			// [016][ ][ ][ ]
		}

		// Image Width & Height
		{
			FileInputStream fis = new FileInputStream("res/pic1.bmp");

			//필요없는 데이터 건너뛰
			//Signature
			fis.read();
			fis.read();

			//File Size
			fis.read();
			fis.read();
			fis.read();
			fis.read();

			//Reserved 1,2
			fis.read();
			fis.read();
			fis.read();
			fis.read();

			//File Offset to PixelArray
			fis.read();
			fis.read();
			fis.read();
			fis.read();
			
			//DIB Header Size
			fis.read();
			fis.read();
			fis.read();
			fis.read();
			
			//Image Width
			n1=fis.read();
			n2=fis.read();
			n3=fis.read();
			n4=fis.read();
			
			//Image Height
			n5=fis.read();
			n6=fis.read();
			n7=fis.read();
			n8=fis.read();
			
			
			
			int width = n1 << 0 | n2 << 8 | n3 << 16 | n4 << 24;
			int height = n5 << 0 | n6 << 8 | n7 << 16 | n8 << 24;
			
			System.out.printf("Width : %d, Height : %d\n",width,height );

		}

	}

}
