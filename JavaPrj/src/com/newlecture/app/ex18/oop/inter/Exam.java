package com.newlecture.app.ex18.oop.inter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public abstract class Exam {
    private int kor;
    private int eng;
    private int math;

    //인스턴스 생성시 초기화진행. 생성자 매개변수 버전
    //생성자 오버로드
    public Exam() {//객체의 초기화(이름이 없어서 여러번 호출 할 방법이 없음)
        this(3, 4, 5);//이름이 없기때문에 this를 사용한다.
    }

    public Exam(int kor, int eng, int math) {//객체의 초기화(이름이 없어서 여러번 호출 할 방법이 없음)
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int total() {
        return kor + eng + math;
    }

    //자식이 이 메서드를 책임지게 해야 한다.(override)
    public abstract float avg();

    public void save(String fileName) throws IOException {
        String path = "JavaPrj/res/ex11/" + fileName;

        FileOutputStream fos = new FileOutputStream(path);
        PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
        //CSV : ex -> 30,40,50

        fout.printf("%d, %d, %d", kor, eng, math);

        fout.close();
        fos.close();
    }

    public void load(String fileName) throws IOException {
        String path = "JavaPrj/res/ex11/" + fileName;

        FileInputStream fis = new FileInputStream(path);
        Scanner fscan = new Scanner(fis);


        String line = fscan.nextLine();
        String[] tokens = line.split(", ");

        kor = Integer.parseInt(tokens[0]);
        eng = Integer.parseInt(tokens[1]);
        math = Integer.parseInt(tokens[2]);

        System.out.println("불러오기 완료");
        System.out.printf("kor : %d, eng : %d, math : %d", kor, eng, math);
        System.out.println();

        fscan.close();
        fis.close();
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("kor : ");
        kor = scan.nextInt();

        System.out.print("eng : ");
        eng = scan.nextInt();

        System.out.print("math : ");
        math = scan.nextInt();
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}// end class
