package 방과후연습용.Jin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;
//        :  제어구조 + 배열
//        —------------------------------------------------------------------

public class Ex_0622_3 {
    public static void main(String[] args) throws IOException {
        // 문제 1) res/alphabet.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
        //   abcdefghijklmno
        // 문제  2) alphabet이라는 이름으로 문자 15개를 저장할 수 있는 배열 객체를 생성한다.
        //[      ] alphabet = [                                    ];
        char[] alphabet = new char[15];//문자 저장공간

        // 문제 3) res/alphabet.txt 파일에 저장된 구분자가 없는 영문자 값들을 alphabet 배열에 로드한다.
        // 값 로드하기
        int alphabetLength = -1;//반복문에 지속적을 사용하기위해..지역화안에 않넣음
        {
            FileInputStream fis = new FileInputStream("afterschool/res/alhphabet.txt");
            Scanner sc = new Scanner(fis);

            String full = sc.nextLine();//abcdefghijklmno 한번에 받아와 full에 저장.
            alphabetLength = full.length();//받아온 값의 길이를 구한다.(추후 반복문에 이용)

            for (int i = 0; i < alphabetLength; i++) {
                alphabet[i] = full.charAt(i);//한 글자씩 alphabet[]에 넣어준다.
            }
            sc.close();
            fis.close();

            for (int i = 0; i < alphabetLength; i++)//일어온 값 출력
                System.out.printf("%c ", alphabet[i]);

            System.out.println("로드 완료");

        }

        //문제 4) 배열의 값이 다음과 같은 상태가 되도록 자리를 바꾼다.
        //onmlkjihgfedcba (역순)
        {
            for (int i = 0; i < alphabetLength - 1; i++)//역순 정렬 완료(버블정렬)
                for (int j = 0; j < alphabetLength - 1; j++) {
                    if (alphabet[j] < alphabet[j + 1]) {
                        char temp = alphabet[j];
                        alphabet[j] = alphabet[j + 1];
                        alphabet[j + 1] = temp;
                    }
                }

            for (int i = 0; i < alphabetLength; i++)//역순 정렬 출력
                System.out.printf("%c ", alphabet[i]);

            System.out.println("자리 변경 완료");
        }

        //문제 4) res/ahphabet-out.txt 파일로 배열의 값들을 저장
        //값 저장하기
        {
            FileOutputStream fos = new FileOutputStream("afterschool/res/alphabet_out.txt");
            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

            //파일 출력
            for (int i = 0; i < alphabet.length; i++)
                fout.printf("%c ", alphabet[i]);

            //콘솔 출력
            for (int i = 0; i < alphabet.length; i++)
                System.out.printf("%c ", alphabet[i]);

            fout.close();
            fos.close();
        }
    }
}
