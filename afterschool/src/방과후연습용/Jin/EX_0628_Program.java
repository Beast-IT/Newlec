package 방과후연습용.Jin;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class EX_0628_Program {
    public static void main(String[] args) throws IOException {
        //lottos[0][] -> 번호 자동생성, lottos[1][] -> 번호 수동생성
        final int auto = 0;
        final int manual = 1;

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
                            lottos[auto][i] = rand.nextInt(45) + 1;//Random(45)는 0~44까지의 범위를 만든다. 그래서 +1
                            for (int j = 0; j < i; j++) {
                                if (lottos[auto][i] == lottos[auto][j])
                                    i--;
                            }
                        }
                    }

                    //추출한 값 작은 숫자부터 정렬(선택정렬)
                    {
                        for (int i = 0; i < 6 - 1; i++) {
                            int minIndex = i;
                            for (int j = 0; j < (6 - 1) - i; j++) {
                                if (lottos[auto][minIndex] > lottos[auto][j + 1 + i])
                                    minIndex = i + j + 1;
                            }
                            int temp = lottos[auto][i];
                            lottos[auto][i] = lottos[auto][minIndex];
                            lottos[auto][minIndex] = temp;
                        }
                    }
                    //로또 출력
                    {
                        for (int j = 0; j < 6; j++)
                            System.out.printf("(%d) ", lottos[auto][j]);
                    }
                    System.out.println();


                    System.out.println("\n1. 저장하고 메인메뉴로 가기");
                    System.out.println("2. 취소하고 메인메뉴로 가기");
                    System.out.print(">_ ");

                    int meun2 = scan.nextInt();

                    switch (meun2) {
                        case 1: {
                            System.out.print("\n저장했습니다.");
                            FileOutputStream fos = new FileOutputStream("JavaPrj/res/ALottos_save.txt");
                            PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

                            for (int i = 0; i < 6; i++)
                                fout.printf("%d ", lottos[auto][i]);

                            fout.println();

                            fout.close();
                            fos.close();
                            System.out.println();
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

                    boolean onOff = true;

                    AGAIN:
                    do {
                        //사용자의 입력값을 한줄로 받아옴.
                        System.out.println("    1 ~ 45 숫자를 입력하세요  ");
                        System.out.println("    예) 1 2 23 24 28 45     ");
                        System.out.print("입력 > ");

                        //개행문자 날려버리기
                        scan.nextLine();
//                        scan.skip("[\\r\\n]+");

                        //문자열로 한번에 받아옴.
                        String input = scan.nextLine();
                        String[] arr = input.split(" ");

                        //문자열로 받아온 숫자를 정수로 변환해줌.
                        for (int i = 0; i < 6; i++)
                            lottos[manual][i] = Integer.parseInt(arr[i]);

                        //입력범위 설정
                        for (int j = 0; j < 6; j++)
                            if ((lottos[manual][j] < 1 || 45 < lottos[manual][j])) {
                                System.out.println("\n   1~ 45 범위의 숫자를 입력하세요.");
                                continue AGAIN;
                            }


                        //중복제거
                        {
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    if (lottos[manual][i] == lottos[manual][j]) { // 중복 검사
                                        System.out.println("\n     중복된 요소가 있습니다! ");
                                        continue AGAIN;
                                    }
                                }
                            }
                            //i 0 |  1 |  2  |   3   |    4    |     5
                            //j - |  0 | 0 1 | 0 1 2 | 0 1 2 3 | 0 1 2 3 4
                        }
                        System.out.println("\n1. 저장하고 메인메뉴로 가기");
                        System.out.println("2. 취소하고 메인메뉴로 가기");
                        System.out.print(">_ ");

                        int meun2 = scan.nextInt();

                        switch (meun2) {
                            case 1: {
                                System.out.print("\n저장했습니다.");
                                FileOutputStream fos = new FileOutputStream("JavaPrj/res/MLottos_save.txt");
                                PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

                                for (int i = 0; i < 6; i++)
                                    fout.printf("%d ", lottos[manual][i]);
                                fout.println();

                                fout.close();
                                fos.close();
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("저장하지 않고 메인 메뉴로 돌아갑니다.");
                                break;
                            }
                        }
                        onOff = false;
                    } while (onOff);

                    break;

                }
                case 3: {
                    FileInputStream fis = new FileInputStream("JavaPrj/res/ALottos_save.txt");
                    FileInputStream fis1 = new FileInputStream("JavaPrj/res/MLottos_save.txt");
                    Scanner sc = new Scanner(fis);
                    Scanner sc1 = new Scanner(fis1);

                    System.out.println("┌───────────────────────────┐");
                    System.out.println("      로또를 불러옵니다...      ");
                    System.out.println("└───────────────────────────┘");
                    System.out.println();

                    String autoLotto = sc.nextLine();
                    String manualLotto = sc1.nextLine();

                    sc1.close();
                    sc.close();
                    fis1.close();
                    fis.close();

                    System.out.printf("자동 로또번호 %s\n", autoLotto);
                    System.out.printf("수동 로또번호 %s\n", manualLotto);

                    break;
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
