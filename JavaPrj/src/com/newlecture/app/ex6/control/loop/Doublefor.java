package com.newlecture.app.ex6.control.loop;

public class Doublefor {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < i+3; j++) {
				System.out.printf("%d ", j + 1);
			}
			
			System.out.println();
		}
	}

}
