package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {

			for (int x = 0; x < 12; x++) {
				for (int y = 0; y < 12; y++) {
					
					if(x==0)
						if(y==0)
							System.out.print("┌");
						else if(y==11)
							System.out.print("┐");
						else
							System.out.print("┬");
					
					else if(x==11)
						if(y==0)
							System.out.print("└");
						else if(y==11)
							System.out.print("┘");
						else 
							System.out.print("┴");
						
					else
						if(y==0)
							System.out.print("├");
						else if (y==11)
							System.out.print("┤");
						else
							System.out.print("┼");
							
						
					
				}
					
				/*
						
			
						
					else if (y == 0)// 왼쪽 막기
						System.out.print("├");
					else if (y == 11)// 오른쪽 막기
						System.out.print("┤");
				
					else
						System.out.print("┼");
*/				

				System.out.println();
			}
		}

}// end main

//●○┼ ┴ ┬ 			