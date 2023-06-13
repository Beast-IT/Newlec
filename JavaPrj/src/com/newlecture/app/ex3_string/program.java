package com.newlecture.app.ex3_string;

public class program {

	public static void main(String[] args) {

		
		System.out.println("----------------------------------------------");
		
		String name1 = "아이유";// 실행환경이 입힌 갑옷
//		String name2 = "아이유";
		String name2 = new String("아이유");// 내가 입힌 갑옷
		// ==이라는 기호가 값이 같은지? 박스가 같은지? 비교해보자.
		// 결과는 false가 나온다. 참조하는 객체가 달라서 이럼.

		System.out.println(name1 == name2);// 같은 객체를 참조하고 있는지를 비교 false
		System.out.println(name1.equals(name2));// 객체의 값이 같은지를 비교 true
		System.out.println(name1 == "아이유");// 결과는 true name1박스에서 만든 박스로 비교하는것. true

		System.out.println("----------------------------------------------");

		// 파일명에서 확장자를 제외한 파일명만 출력하시오.
		// =위의 팡리명에서 점(.)이 있는 곳까지의 문자열을 출력하시오.(단 점(.) 제외)
		String fileName = "photo.jpg";
		System.out.println(fileName.length());// 문자열의 길이를 알 수 있다. 결과 값 : 9
		System.out.println(fileName.indexOf("."));// "." 의 위치를 알 수 있다. 5번째에 위치하고 있음.
		System.out.println(fileName.substring(0, 3));// 0~3까지의 문자만 출력한다. pho가 나온다.
		System.out.println(fileName.substring(0, 5));// 0~5까지의 문자만 출력한다. photo가 나온다.

		String p = fileName.substring(0, 5);
		String w = fileName.substring(6, 9);
		System.out.printf("\n%s"+"%s\n",p,w);
		
		
		int index = fileName.indexOf(".");// 점(.)이 위치한값을 구해서 index에 저장한다.
		String name = fileName.substring(0,index);//
		System.out.println(name);//끝나는 부분을 index으로 설정.
		
		
		System.out.println("----------------------------------------------");
		
		int x = 3;
		Integer 정수갑옷 = Integer.valueOf(x);// new Integer(x); Boxing
		int x1 = 정수갑옷.intValue();// Unboxing
		

		String y = "hello";// 태생이 갑옷을 입고있는 문자열!

		double d1 = 3.9;
		Double 더블갑옷 = Double.valueOf(d1);// new Double(d1);
		double d2 = 더블갑옷.doubleValue();// Unboxing

		// ---정수를 문자열로 변환 & 문자열을 더블로 변환.
		int n1 = 10;
		String s1 = String.valueOf(n1);

		String s2 = "30.2";
		double n2 = Double.parseDouble(s2);
	}

}
