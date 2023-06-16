package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {
		
		for (int j = 0; j < 12; j++) {
			for (int i = 0; i < 10; i++) {
				if(j==0)
					System.out.print("┬");
				else if(j==11)
					System.out.print("┴");
				else
					System.out.print("┼");
			}
			
			System.out.println();
		}

	}

}
