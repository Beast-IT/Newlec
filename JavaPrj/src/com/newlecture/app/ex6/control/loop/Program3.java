package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		// 4바이트 데이터 읽기
		int n1, n2, n3, n4;
//		int n5 , n6, n7 , n8 ;

		// Image Width & Height
		{
			FileInputStream fis = new FileInputStream("res/pic1.bmp");
			// 18 바이트를 읽어서 버리세요.

			// 필요없는 데이터 건너뛰어 넘기.
			
			for(int i=0;i<18;i++) 
				fis.read();
			

			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();
			
			
			
			int width = n1 << 0 | n2 << 8 | n3 << 16 | n4 << 24;
//			int height = n5 << 0 | n6 << 8 | n7 << 16 | n8 << 24;

			System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
			System.out.printf("Width : %d \n", width);
			
			
			

		}

	}

}
