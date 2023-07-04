package 방과후연습용.Jin.StoryGame;

import java.util.Scanner;

public class GameProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //사용자 입력 값.
        int input = 0;

        //while 탈출 스위치
        boolean onOff = false;

        //HP 초기값
        int hp = 40;

        //HP 상태표시
        char hpBar = '▰';

        //HP index
        int hpIndex = (int) hp / 10;

            //1번째 질문
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("       ☣1898년 12월12일 영하 -10도☣           ");
            System.out.println("  현재시간..21시44분 아무것도 보이지 않는다   ");
            System.out.println();
            System.out.println("           여기는 관악산이다...            ");
            System.out.println("└───────────────────────────────────────┘");
            hpFunction(hpBar, hpIndex);
            System.out.println();
            System.out.println("1. 계속");
            System.out.println("2. 그만두기");
            System.out.print("_> ");

            input = scan.nextInt();
        CON:
        do {
            switch (input) {
                //1번 선택
                case 1: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.printf("    너는 조난 당했다. 현재 체력 %d 퍼센트\n", hp);
                    System.out.println("└───────────────────────────────────────┘");
                    hpFunction(hpBar, hpIndex);
                    System.out.println();
                    hp = 30;
                    onOff = false;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }

                //2번 선택
                case 2: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("    삶을 포기하지 마라...살려고 노력해봐라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    continue CON;
                }
                default: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   정신줄 잘 잡고 정확한 숫자를 입력해라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
            }
        } while (onOff);
        System.out.println("------------------------------------------------------------------");

        do {
            //2번째 질문
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("      저 멀리 희미하게 불빛이 보인다.        ");
            System.out.println("└───────────────────────────────────────┘");
            hpFunction(hpBar, hpIndex);
            System.out.println();
            System.out.println("1. 불빛 방향으로 걸어간다.");
            System.out.println("2. 날이 밝을때 까지 기다린다.");
            System.out.print("_> ");

            input = scan.nextInt();


            switch (input) {
                //1번 선택
                case 1: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("     뚜벅...뚜벅...불빛을 따라 걸어오니   ");
                    System.out.println("  전문 산악인 KYN씨가 라면을 끓여먹고있었다. ");
                    System.out.println("    라면을 뺏어 먹으니 몸에서 힘이 난다!  ");
                    System.out.println("└───────────────────────────────────────┘");
                    hp=50;
                    hpFunction(hpBar, hpIndex);
                    System.out.println();
                    onOff = false;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }

                //2번 선택
                case 2: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   극야현상때문에 내일은 해는 뜨지 않는다.");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   정신줄 잘 잡고 정확한 숫자를 입력해라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
            }
        } while (onOff);


        System.out.println("------------------------------------------------------------------");

        //3번째 질문
        do {
            //3번째 질문
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("   설거지를 하러간 KYN씨가 돌아오지 않는다.           ");
            System.out.println("      도망..갔다! 이제 나 혼자남았다...   ");
            System.out.println("        옆에 손전등을 흘리고 갔다       ");
            System.out.println("└───────────────────────────────────────┘");
            hpFunction(hpBar, hpIndex);
            System.out.println();
            System.out.println("1. 손전등을 훔친다.(˵¯͒⌄¯͒˵)");
            System.out.println("2. 그냥 지나친다.");
            System.out.print("_> ");

            input = scan.nextInt();


            switch (input) {
                //1번 선택
                case 1: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   역시 전문 산악인의 손전등은 다르다!  ");
                    System.out.println(" 해가 떠있는줄 알았다! 이제 하산할 준비는 끝 ");
                    System.out.println("    체력이 0이 되면 죽으니 서두르자 ");
                    System.out.println("└───────────────────────────────────────┘");
                    hp = 30;
                    hpFunction(hpBar, hpIndex);
                    System.out.println();
                    onOff = false;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }

                //2번 선택
                case 2: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("  잘 생각해보고 선택하자...어둡다고 말했다.");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    System.out.println("------------------------------------------------------------------");
                    onOff = true;
                    break;
                }
                default: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   정신줄 잘 잡고 정확한 숫자를 입력해라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    System.out.println("------------------------------------------------------------------");
                    onOff = true;
                    break;
                }
            }
        } while (onOff);

        System.out.println("------------------------------------------------------------------");

        //4번째 질문
        do {
            //4번째 질문
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("        체력이 떨어지기 전에 서두르자        ");
            System.out.println("    걸어서갈까...? 아니면 뛰어서 갈까...?    ");
            System.out.println("      라면도 먹었으니...고민을 해야겠다.     ");
            System.out.println("└───────────────────────────────────────┘");
            hp=20;
            hpFunction(hpBar, hpIndex);
            System.out.println();
            System.out.println("1. 뛰어간다.");
            System.out.println("2. 걸어간다.");
            System.out.print("_> ");

            input = scan.nextInt();


            switch (input) {
                //1번 선택
                case 1: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("       뛰어서 내려가니 너무 숨이찬다.    ");
                    System.out.println("       너무 시끄럽게 뛰어온건가...?        ");
                    System.out.println("      옆에서 이상한 소리가 들린다...        ");
                    System.out.println("└───────────────────────────────────────┘");
                    hp = 10;
                    hpFunction(hpBar, hpIndex);
                    System.out.println();
                    onOff = false;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }

                //2번 선택
                case 2: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("      걷다가 체력소모로 죽을 수 있다..");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   정신줄 잘 잡고 정확한 숫자를 입력해라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
            }
        } while (onOff);

        System.out.println("------------------------------------------------------------------");

        do {
            //5번째 질문
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("               곰이다!!!       ");
            System.out.println("    사실 손전등말고 칼도 훔치긴했는데...    ");
            System.out.println("             한판 붙어볼까?    ");
            System.out.println("└───────────────────────────────────────┘");
            hpFunction(hpBar, hpIndex);
            System.out.println();
            System.out.println("1. 싸운다.");
            System.out.println("2. 도망간다.");
            System.out.print("_> ");

            input = scan.nextInt();


            switch (input) {
                //1번 선택
                case 1: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("        슝~ 픽! 펑! 퍽!....퍽!  ");
                    System.out.println("       너무 크게 다쳐서 일어날 수 없다.       ");
                    System.out.println("     나는 이제...여기서 생으ㄹ........      ");
                    System.out.println("└───────────────────────────────────────┘");
                    hp=10;
                    hpFunction(hpBar, hpIndex);
                    System.out.println();
                    onOff = false;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }

                //2번 선택
                case 2: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println(" 남자라면 정면 승부다! 비겁하게 도망치지 마라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("   정신줄 잘 잡고 정확한 숫자를 입력해라");
                    System.out.println("└───────────────────────────────────────┘");
                    System.out.println();
                    onOff = true;
                    System.out.println("------------------------------------------------------------------");
                    break;
                }
            }
        } while (onOff);

        System.out.println("┌───────────────────────────────────────┐");
        System.out.println("               ☣ 사망 ☣                  ");
        System.out.println("                  끝                     ");
        System.out.println("└───────────────────────────────────────┘");
    }

    private static void hpFunction(char hpBar, int hpIndex) {
        System.out.print("HP : ");
        for (int i = 0; i < hpIndex; i++)
            System.out.print(hpBar);
        System.out.println();
    }
}
