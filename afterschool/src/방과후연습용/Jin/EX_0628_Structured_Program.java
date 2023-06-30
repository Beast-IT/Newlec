package 방과후연습용.Jin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class EX_0628_Structured_Program {
    public static void main(String[] args) throws IOException {
        //lottos[0][] -> 번호 자동생성, lottos[1][] -> 번호 수동생성
        //상수(constant) final을 이용해서 auto, manual을 구분하였음.
        final int auto = 0;
        final int manual = 1;

        int[][] lottos = new int[2][6];

        QUIT:
        while (true) {
            //메뉴 출력 & 번호 입력
           int menu = inputMeun();

            switch (menu) {
                case 1: {
                    //자동 로또 출력 메서드
                    autoOutputLotto(lottos,auto);
                    break;
                }
                case 2: {
                    //수동 로또 출력 메서드
                    manualOutputLotto(lottos,manual);
                    break;

                }
                case 3: {
                    //로또 불러오기
                    loadLotto();
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

    private static void loadLotto() throws IOException{
        FileInputStream fis = new FileInputStream("JavaPrj/res/ALottos_save.txt");
        FileInputStream fis1 = new FileInputStream("JavaPrj/res/MLottos_save.txt");
        Scanner sc = new Scanner(fis);
        Scanner sc1 = new Scanner(fis1);

        System.out.println("┌───────────────────────────┐");
        System.out.println("      로또를 불러옵니다...      ");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        //nextLine으로 한번에 받아옴. (정수형으로 연산작업하는 일이 없어서 String으로 받아옴)
        String autoLotto = sc.nextLine();
        String manualLotto = sc1.nextLine();

        sc1.close();
        sc.close();
        fis1.close();
        fis.close();

        System.out.printf("자동 로또번호 %s\n", autoLotto);
        System.out.printf("수동 로또번호 %s\n", manualLotto);
    }

    private static void manualOutputLotto(int[][] lottos, int manual) throws IOException{
        Scanner scan = new Scanner(System.in);

        System.out.println("┌───────────────────────────┐");
        System.out.println("     Lotto 번호 수동 생성     ");
        System.out.println("└───────────────────────────┘");

        Scanner scan1 = new Scanner(System.in);

        boolean onOff = true;

        AGAIN:
        do {
            //사용자의 입력값을 한줄로 받아옴.
            System.out.println("┌───────────────────────────┐");
            System.out.println("    1 ~ 45 숫자를 입력하세요  ");
            System.out.println("    예) 1 2 23 24 28 45     ");
            System.out.println("└───────────────────────────┘");
            System.out.print("입력 > ");

            //문자열로 한번에 받아옴.
            String input = scan1.nextLine();
            String[] arr = input.split(" ");

            //입력받은 값이 6개가 아니면 다시
            if(!(arr.length==6)) {
                System.out.printf(" ★ %d개의 숫자를 입력하셨습니다. 6개의 숫자를 입력하세요. ★\n",arr.length);
                continue AGAIN;
            }


            //문자열로 받아온 숫자를 정수로 변환해줌.
            for (int i = 0; i < 6; i++)
                lottos[manual][i] = Integer.parseInt(arr[i]);

            //입력범위 설정
            for (int j = 0; j < 6; j++)
                if ((lottos[manual][j] < 1 || 45 < lottos[manual][j])) {
                    System.out.println("┌──────────────────────────────────┐");
                    System.out.println( " ★ 1~ 45 범위의 숫자를 입력하세요.★     ");
                    System.out.println("└──────────────────────────────────┘");
                    System.out.println("\n   ");
                    continue AGAIN;
                }

            //중복제거
            {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        if (lottos[manual][i] == lottos[manual][j]) { // 중복 검사
                            System.out.println("\n  ♨ 중복된 요소가 있습니다! ♨\n");
                            continue AGAIN;
                        }
                    }
                }
                //i 0 |  1 |   2 |     3 |       4 |         5
                //j - |  0 | 0 1 | 0 1 2 | 0 1 2 3 | 0 1 2 3 4
            }

            //로또 저장
            System.out.println("┌───────────────────────────┐");
            System.out.println("          저장하실?           ");
            System.out.println("└───────────────────────────┘");
            System.out.println();
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
                    System.out.println("♨ 저장하지 않고 메인 메뉴로 돌아갑니다. ♨");
                    break;
                }
            }
            onOff = false;
        } while (onOff);
    }

    private static void autoOutputLotto(int[][] lottos, int auto) throws IOException {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("┌───────────────────────────┐");
        System.out.println("     Lotto 번호 자동 생성     ");
        System.out.println("└───────────────────────────┘");
        System.out.println("┌───────────────────────────┐");
        System.out.println("   ↓  ★☆ 로또 번호 ★☆  ↓    ");
        System.out.println("└───────────────────────────┘");

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
                System.out.print("\n    ☆★저장했습니다.☆★ ");
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
    }

    private static int inputMeun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("┌───────────────────────────┐");
        System.out.println("            ★\"★            ");
        System.out.println("          ★Lotto★          ");
        System.out.println("           ★^o^★           ");
        System.out.println("└───────────────────────────┘");
        System.out.println();

        System.out.println("1. 번호 자동 생성");
        System.out.println("2. 번호 수동 생성");
        System.out.println("3. 내 로또 번호 보기");
        System.out.println("4. 종료");
        System.out.print("선택 >");
        int menu = scan.nextInt();
        return menu;
    }
}
