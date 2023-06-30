package com.newlecture.app.ex9.struct;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {

        //성적 로드
        Exam[] exams = new Exam[20];
            int index = 0;

        //exams라는 객체배열에 대입연산 작업
        {
            FileInputStream fis = new FileInputStream("JavaPrj/res/exam.data");
            Scanner fscan = new Scanner(fis);

            fscan.nextLine();


            while (fscan.hasNextLine()) {

                //반복문안에 선언은 여러번 이루어지지 않은.(반복문 들어가기전에 이미 준비해서 들어온다.)
                // " = " 뒤에 있는 new Exam();이 연산자여서 새로운 공간이 반복할때마다 계속 생성되는 것이다.
                Exam exam = new Exam();

                String line = fscan.nextLine(); //"80,90,95"
                String[] tokens = line.split(",");//"80,90,95" -> "80" "90" "95"


                int kor = Integer.parseInt(tokens[0]);
                int eng = Integer.parseInt(tokens[1]);
                int math = Integer.parseInt(tokens[2]);
                int total = kor + eng + math;
                float avg = (float) total / 3.0f;

                exam.kor = kor;
                exam.eng = eng;
                exam.math = math;
                exam.total = total;
                exam.avg = avg;

                exams[index++] = exam;//참조 대입!!!!참조하는 대상이 다르다.!!!! 값 대입 X

            fscan.close();
            fis.close();
            }

            //굳이 참조변수가 존재하는 이유는 무엇입니까?
            //C++에서 등장했고 그것을 물려받았다고 하셨는데요.
            //굳이??

            //하두기? 씨퀄?

            //객체를 공유하거나 참조?(포인팅)하는 방법이 없어서가 아니라
            //C++은 원래 이름은 C with Class엿는데, 여기서 Class라는 것은
            //캡슐화 도구로 객체지향 프로그래밍이라는 방법론과 관련된

            //객체 지향은 실세계 다시 말하면 책임을 가지는 역할자 들의
            //코드를 정리하는 방법이라고 생각하면 됩니다.

            //주소를 저장하는 변수 : 포인터
            //주소(x)없이 객체를 부르는 이름 : 참조변수


            //만약에 1번째 학생의 성적이 그 다음(2번쨰) 학생의 성적보다 크다며 바꿔서 출력해주세요.
            //자리바꾸기
//                {
//                    if (exams[0].avg > exams[1].avg) {
//                        Exam temp = exams[0];
//                        exams[0] = exams[1];
//                        exams[1] = temp;
//                    }
//                }

            //로드한 성적을 성적순으로 정렬하시오.
            {
                int size = index;
                for (int i = 0; i < size - 1; i++)
                    for (int j = 0; j < size - 1 - i; j++)
                        if (exams[j].avg < exams[j + 1].avg) {
                            Exam temp = exams[j];
                            exams[j] = exams[j + 1];
                            exams[j + 1] = temp;
                        }
            }


            //성적 출력용
            {
                int size = index;
                int num=1;
                for (int i = 0; i < size; i++) {
                    Exam exam = exams[i];
                    int kor = exam.kor;
                    int eng = exam.eng;
                    int math = exam.math;

                    int total = exam.total;
                    float avg = exam.avg;

//                    if (avg >= 80)//성적 80이상
                    System.out.printf("%d등 %3d, %3d, %3d, 총점 %3d 평균 %.2f\n",num, kor, eng, math, total, avg);
                    num++;
                }
            }

        }// 성적 로드
    }//end main
}//end class
