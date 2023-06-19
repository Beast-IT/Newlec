package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
 
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		FileOutputStream fos = new FileOutputStream("res/pic_copy.bmp");


		
		int n = -1;
		while ((n = fis.read()) != -1) {
			fos.write(n);
		}

		
		
		fos.close();
		fis.close();

		System.out.println("작업완료");
		
		//시간측정
		long startTime = System.currentTimeMillis();
		 
		try {
		    // 5초간 지연
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		 
		long endTime = System.currentTimeMillis();
		 
		System.out.println("Time in milliSeconds: " + (endTime - startTime));
		System.out.println("Time in seconds: " + (endTime - startTime)/1000);

	}

}
