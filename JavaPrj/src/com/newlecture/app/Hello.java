package com.newlecture.app;

public class Hello {
	public static void main(String[] args) {


		
		int kor1, kor2, kor3;// 국어 성적 변수
		int total;
		float avg;

		// 성적 계산

		kor1 = 50; // 0보다 크고 100보다 작은 값으로 대입
		kor2 = 60;
		kor3 = 80;

		// 성적 계산
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;// 묵시적인 형변환
//		avg=(float)(total/3.0);//명시적인 형변환 
		

		// 성적 출력
		System.out.printf("total is %d\n", /* 정수 값 */ total);
		System.out.printf("avg is %5.2f\n", avg);
		
		
	}

}
