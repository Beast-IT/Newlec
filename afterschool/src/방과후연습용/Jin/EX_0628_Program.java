package 방과후연습용.Jin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class EX_0628_Program {
    public static void main(String[] args) throws IOException {
        //lottos[0][] -> 번호 자동생성, lottos[1][] -> 번호 수동생성
        int[][] lottos = new int[2][6];

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        QUIT:
        while (true) {
            System.out.println("┌───────────────────────────┐");
            System.out.println("      Lotto 관리 프로그램     ");
            System.out.println("└───────────────────────────┘");
            System.out.println();

            System.out.println("1. 번호 자동 생성");
            System.out.println("2. 번호 수동 생성");
            System.out.println("3. 내 로또 번호 보기");
            System.out.println("4. 종료");
            System.out.print("선택 >");
            int menu = scan.nextInt();


            switch (menu) {
                case 1: {
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("     Lotto 번호 자동 생성     ");
                    System.out.println("└───────────────────────────┘");
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("          로또 번호           ");
                    System.out.println("└───────────────────────────┘");
                    System.out.println();

                    //랜덤한 값 추출 & 중복제거
                    {
                        for (int i = 0; i < 6; i++) {
                            lottos[0][i] = rand.nextInt(45) + 1;//Random(45)는 0~44까지의 범위를 만든다. 그래서 +1
                            for (int j = 0; j < i; j++) {
                                if (lottos[0][i] == lottos[0][j])
                                    i--;
                            }
                        }
                    }

                    //추출한 값 작은 숫자부터 정렬(선택정렬)
                    {
                        for (int i = 0; i < 6 - 1; i++) {
                            int minIndex = i;
                            for (int j = 0; j < (6 - 1) - i; j++) {
                                if (lottos[0][minIndex] > lottos[0][j + 1 + i])
                                    minIndex = i + j + 1;
                            }
                            int temp = lottos[0][i];
                            lottos[0][i] = lottos[0][minIndex];
                            lottos[0][minIndex] = temp;
                        }
                    }
                    System.out.println();
                    //로또 출력
                    {
                        for (int j = 0; j < 6; j++)
                            System.out.printf("%d, ", lottos[0][j]);
                    }
                    System.out.print("\b\b");//이스케이프 문자 지우기.
                    System.out.println();


                    System.out.println("1. 저장하고 메인메뉴로 가기");
                    System.out.println("2. 취소하고 메인메뉴로 가기");
                    System.out.print(">_ ");

                    int meun2 = scan.nextInt();

                    switch (meun2) {
                        case 1: {
                            System.out.println("저장했습니다.");
                            FileOutputStream fos = new FileOutputStream("JavaPrj/res/Lottos_save.txt");
                            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

                            for (int i = 0; i < 6; i++)
                                fout.printf("%d ", lottos[0][i]);

                            fout.println();

                            fout.close();
                            fos.close();
                            break;
                        }
                        case 2: {
                            System.out.println("저장하지 않고 메인 메뉴로 돌아갑니다.");
                            break;
                        }
                    }

                    break;
                }
                case 2: {
                    System.out.println("┌───────────────────────────┐");
                    System.out.println("     Lotto 번호 수동 생성     ");
                    System.out.println("└───────────────────────────┘");

                    System.out.print("입력 _>");
                    String input = new String();
                    input = scan.next();


//                    break;

                }
                case 3: {

                }
                case 4: {
                    System.out.println("종료");
                    break QUIT;

                }
                default:
                    System.out.println("1~4값만 입력하세요.");

            }
        }//end while
    }
}
