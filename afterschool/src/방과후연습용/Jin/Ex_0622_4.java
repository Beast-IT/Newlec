package 방과후연습용.Jin;

public class Ex_0622_4 {
    public static void main(String[] args) {
        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++)
                if (y == x) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
                    System.out.print("○");
                else if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    System.out.print("┌");
                else if (x == 10 && y == 11)// 오른쪽 아래 모서리막기
                    System.out.print("┘");
                else if (x == 10 && y == 0)// 왼쪽 아래 모서리막기
                    System.out.print("└");
                else if (x == 0 && y == 11)// 오른쪽 위 모서리막기
                    System.out.print("┐");

                else if (x == 0)// 위에 막기
                    System.out.print("┬");
                else if (x == 10)// 아래 막기
                    System.out.print("┴");
                else if (y == 0)// 왼쪽 막기
                    System.out.print("├");
                else if (y == 10)// 오른쪽 막기
                    System.out.print("┤");
                else
                    System.out.print("┼");

            System.out.println();
        }
        System.out.println("------------------------------------------------");
        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++)
                if (x == y) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
                    System.out.print("○");
                else if (x == 10 - y) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
                    System.out.print("○");
                else if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    System.out.print("┌");
                else if (x == 10 && y == 10)// 오른쪽 아래 모서리막기
                    System.out.print("┘");
                else if (x == 10 && y == 0)// 왼쪽 아래 모서리막기
                    System.out.print("└");
                else if (x == 0 && y == 10)// 오른쪽 위 모서리막기
                    System.out.print("┐");

                else if (x == 0)// 위에 막기
                    System.out.print("┬");
                else if (x == 10)// 아래 막기
                    System.out.print("┴");
                else if (y == 0)// 왼쪽 막기
                    System.out.print("├");
                else if (y == 10)// 오른쪽 막기
                    System.out.print("┤");
                else
                    System.out.print("┼");

            System.out.println();
        }

        System.out.println("------------------------------------------------");
        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++)

                if ((x == y) || (x == 10 - y)) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
                    System.out.print("○");
                else if (!(y > x) && !(y < 10 - x)) // 입력받은 값을 바둑판에 ○ 출력(제일 우선순위를 가진다.)
                    System.out.print("○");
                else if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    System.out.print("┌");
                else if (x == 10 && y == 10)// 오른쪽 아래 모서리막기
                    System.out.print("┘");
                else if (x == 10 && y == 0)// 왼쪽 아래 모서리막기
                    System.out.print("└");
                else if (x == 0 && y == 10)// 오른쪽 위 모서리막기
                    System.out.print("┐");

                else if (x == 0)// 위에 막기
                    System.out.print("┬");
                else if (x == 10)// 아래 막기
                    System.out.print("┴");
                else if (y == 0)// 왼쪽 막기
                    System.out.print("├");
                else if (y == 10)// 오른쪽 막기
                    System.out.print("┤");
                else
                    System.out.print("┼");

            System.out.println();
        }
    }
}
