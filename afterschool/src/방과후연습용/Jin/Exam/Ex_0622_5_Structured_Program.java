package 방과후연습용.Jin.Exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Ex_0622_5_Structured_Program {
    public static void main(String[] args) throws IOException {

        Exam exam = new Exam();


        QUIT:
        while (true) {

            //메뉴 입력
            int menu = inputMenu();


            switch (menu) {
                case 1: {
                    //1. 성적 입력
                    inputExams(exam);

                    break;
                }
                case 2: {
                    //2. 성적 출력
                    printExams(exam);

                    break;
                }
                case 3: {
                    //3. 성적 불러오기
                    loadExams(exam);

                    break;
                }
                //4. 성적 저장하기
                case 4: {
                    saveExam(exam);

                    break;
                }
                //5. 프로그램 종료
                case 9: {
                    break QUIT;
                }
                default: {
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("   화면에 표시된 값만 입력하세요   ");
                    System.out.println("└───────────────────────────┘");
                    break;
                }
            }

        }

    }


    private static void saveExam(Exam exam) throws IOException {
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;

        if (kor == -1 || math == -1 || eng == -1) {
            System.out.println("┌───────────────────────────┐");
            System.out.println("     *** 값을 입력하세요 ***      ");
            System.out.println("└───────────────────────────┘");
        } else {

            System.out.println("┌───────────────────────────┐");
            System.out.println("        성적을 저장합니다.        ");
            System.out.println("└───────────────────────────┘");
            System.out.println();

            FileOutputStream fos = new FileOutputStream("afterschool/res/score.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            fout.printf("%d %d %d ", kor, math, eng);

            System.out.println("┌───────────────────────────┐");
            System.out.println("        성적을 저장 했습니다.      ");
            System.out.println("└───────────────────────────┘");
            System.out.println();


            fout.close();
            fos.close();
        }
    }

    private static void loadExams(Exam exam) throws IOException {
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;

        int loadkor=exam.loadkor;
        int loadmath=exam.loadmath;
        int loadeng=exam.loadeng;

        if (kor == -1 || math == -1 || eng == -1) {
            System.out.println("┌───────────────────────────┐");
            System.out.println("     *** 값을 입력하세요 ***    ");
            System.out.println("└───────────────────────────┘");
        } else {
            FileInputStream fis = new FileInputStream("afterschool/res/score.txt");
            Scanner sc = new Scanner(fis);

            System.out.println("┌───────────────────────────┐");
            System.out.println("        성적을 불러옵니다...      ");
            System.out.println("└───────────────────────────┘");
            System.out.println();

            loadkor = sc.nextInt();
            loadmath = sc.nextInt();
            loadeng = sc.nextInt();

            exam.loadkor=loadkor;
            exam.loadmath=loadmath;
            exam.loadeng=loadeng;

            System.out.printf("국어 성적 : %d 점\n", loadkor);
            System.out.printf("수학 성적 : %d 점\n", loadmath);
            System.out.printf("영어 성적 : %d 점\n", loadeng);

            sc.close();
            fis.close();
        }
    }

    public static void printExams(Exam exam) {
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;

        if (kor == -1 || math == -1 || eng == -1) {
            System.out.println("┌───────────────────────────┐");
            System.out.println("     *** 값을 입력하세요 ***     ");
            System.out.println("└───────────────────────────┘");
        } else {
            System.out.println("┌───────────────────────────┐");
            System.out.println("           성적 출력            ");
            System.out.println("└───────────────────────────┘");
            System.out.println();

            System.out.printf("국어 성적 : %d 점\n", kor);
            System.out.printf("수학 성적 : %d 점\n", math);
            System.out.printf("영어 성적 : %d 점\n", eng);
        }
    }

    public static void inputExams(Exam exam) {

        Scanner scan = new Scanner(System.in);

        int kor;
        int eng;
        int math;

        System.out.println("┌───────────────────────────┐");
        System.out.println("           성적 입력            ");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        //국어 성적입력 & 성적 범위 설정
        do {
            System.out.print("국어 성적을 입력하세요 : ");
            kor = scan.nextInt();

            if (kor < 0 || 100 < kor)
                System.out.println("성적범위(0~100)를 벗어났습니다.");

        } while (kor < 0 || 100 < kor);


        //수학 성적입력 & 성적 범위 설정
        do {
            System.out.print("수학 성적을 입력하세요 : ");
            math = scan.nextInt();

            if (math < 0 || 100 < math)
                System.out.println("성적범위(0~100)를 벗어났습니다.");

        } while (math < 0 || 100 < math);

        //영어 성적입력 & 성적 범위 설정
        do {
            System.out.print("영어 성적을 입력하세요 : ");
            eng = scan.nextInt();

            if (eng < 0 || 100 < eng)
                System.out.println("성적범위(0~100)를 벗어났습니다.");

        } while (eng < 0 || 100 < eng);

        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
    }

    private static int inputMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("┌───────────────────────────┐");
        System.out.println("           메인 메뉴          ");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        System.out.println("1. 성적 입력");
        System.out.println("2. 성적 출력");
        System.out.println("3. 성적 불러오기");
        System.out.println("4. 성적 저장하기");
        System.out.println("9. 프로그램 종료");
        System.out.print("선택 >");
        int menu = scan.nextInt();

        return menu;
    }
}
