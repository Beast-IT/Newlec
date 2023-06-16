package com.newlecture.app.ex6.control.loop;

public class Doublefor {

	public static void main(String[] args) {

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {

				if (i == 2)
					System.out.print("a ");
				else if (i == 5)
					System.out.print("b ");
				else if (i==9)
					System.out.print("c ");
				else
					System.out.printf("%d ", i + 1);

			}

			System.out.println();
		}
	}

}
