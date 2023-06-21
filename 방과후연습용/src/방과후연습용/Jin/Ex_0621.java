package 방과후연습용.Jin;

import java.util.Scanner;

public class Ex_0621 {
    public static void main(String[] args) {
        //✏️ 각 기본형 타입별 배열을 모두 선언해보세요. int, byte, boolean 등
//        byte[] a=new int[];
//        short[] b=new short[];
//        int[] c=new int[];
//        long[] d=new long[];
//
//        boolean[] e=new boolean[];
//
//        float[] f=new float[];
//        double[] g=new double[];
//
//        char[] h=new char[];

        //✏️ int형 배열 numbers를 선언하세요
        //✏️ int형 배열 numbers는 기본타입인가요? 참조형
        //✏️ int형 배열 numbers에 크기 10인 배열을 만든 후, 할당하세요.
        //✏️ int형 배열 numbers의 2번째에 숫자 3을 할당하세요

//        int[] numbers;//선언
//        numbersv=vnew int[10];//할당
//        numbers[1]=3;

        //✏️ long형 배열 longNumbers에 크기 3인 배열을 만든 후, 할당하세요.
        //✏️ long형 배열 longNumbers에 크기 3인 배열을 만든 후, index 2번째를 출력해보세요.
        long[] lognNumbers=new long[3];
        System.out.println(lognNumbers[1]);

        //✏️ boolean형 배열 isChecked를 선언하세요. isChecked에 true, false, true를 new연산자없이 할당하세요.
        boolean[] isChecked={true,false,true};

        //✏️ 크기가 20인 int형 배열 numbers를 선언하세요. numbers의 index 0부터 19까지, for문을 이용해서 0, 1,  2… 19를 할당해주세요
        int[] numbers=new int[20];
        for(int i=0;i<20;i++) {
            numbers[i]=i;
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
        //✏️ 크기가 10인 문자형 배열 chars를 선언하세요. 반복문을 이용하여 chars의 index가 3의 배수일 땐 ‘a’를, 5의 배수일때 ‘b’를 할당하여 출력해보세요.
        char[] ch=new char[10];
        for(int i=0;i<10;i++){
            if (i%3==0 && i!=0) {
                ch[i] = 'a';
                System.out.println(ch[i]);
            }
            else if(i%5==0&& i!=0) {
                ch[i]='b';
                System.out.println(ch[i]);
            }
        }
            //✏️ (추가)
            //
            //선언부와 출력부를 수정하지 말고 코드를 작성해
            //
            //3
            //5
            //7
            //
            //과 같이 출력해보세요.
            //
            ////—-------------------------- 선언부
            //
            //int a = 5;
            //int b = 7;
            //int c = 3;
            //
            ////—-------------------------- 코드작성 부분
            //
            //
            //
            //
            ////—-------------------------- 출력부
            //
            //
            //System.out.println(a); // 3
            //System.out.println(b); // 5
            //System.out.println(c); // 7

        // —-------------------------- 선언부
            System.out.println();
            int a = 5;
            int b = 7;
            int c = 3;

        //—-------------------------- 코드작성 부분
            int temp=0;

            temp=a; //temp : 5 / a : 0
            a=b;// b : 5 /
            b=temp;

            temp=a;
            a=c;
            c=temp;




        //—-------------------------- 출력부


            System.out.println(a); // 3
            System.out.println(b); // 5
            System.out.println(c); // 7

        //✏️ (추가2)
        //다음과 같은 결과를 출력해보세요.
        //1을 입력하면 계속 메뉴를 선택하고 9를 누르면 종료가 되는 프로그램을 만들어보세요.
        //
        //메뉴를 선택하시오.
        //1.계속	9.종료
        //9                                 //—----------------> (입력값)
        //종료되었습니다.
        Scanner sc=new Scanner(System.in);

        end:
        while(true) {
            System.out.println("메뉴를 선택하시오.");
            System.out.println("1.계속 9.종료");
            int menu = sc.nextInt();

            con :
            while (true) {
                switch (menu) {
                    case 1: {
                         break con;
                    }

                    case 9: {
                        System.out.println("종료");
                        break end;
                    }
                }
            }
        }

        //✏️ (추가3)
        //// 54321초가 몇시간 몇분 몇초인지 구하시오
        //// 결과 : 15시간 5분 21초
        ////( 1분 = 60초, 1시간 = 60분, 1시간 = 60초 * 60초 = 3600초 )

        int sec=54321;
        int min=0;
        int hous=0;
        int temp1=0;

            min=sec/60;
            temp1=min;
            hous=min/60;
            sec=sec%60;

            temp1=temp1%60;

        System.out.printf("%d시간 %d분 %d초",hous,temp1,sec);
    }
}
