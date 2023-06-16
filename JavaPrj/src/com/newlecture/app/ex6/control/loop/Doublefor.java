package com.newlecture.app.ex6.control.loop;

public class Doublefor {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < 10-i; j++) {
				System.out.printf("%d ", j + 1);
			}
			
			System.out.println();
		}
	}

}
