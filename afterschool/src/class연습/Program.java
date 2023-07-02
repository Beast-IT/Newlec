package class연습;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

//        ---Program.class
//        1. Birthday.txt로부터 입력 받아 사람들의 생일을 00 00 00 형식으로 저장한다.
//        2. 받아온 숫자를 ex) 930629로 합쳐준다.

//        ---Birthday.class
//        3. Program.class 변수를 Birthday라는 클래스에 저장해 준다.

//        ---BirthdayList.class
//        4. 12명의 사람들의 생일을 저장하는 클래스 생성

//        5. 정상적으로 출력

        BirthdayList list = new BirthdayList();

        BirthdayLoad(list);

        BirthdayPrint(list);
    }

    private static void BirthdayPrint(BirthdayList list) {
        Birthday[] saves= list.saves;
        int index= list.index;
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < 1; j++)
                System.out.println(saves[i].result);
        }

    }

    private static void BirthdayLoad(BirthdayList list) throws IOException {

        FileInputStream fis = new FileInputStream("afterschool/res/class연습/Birthday.txt");
        Scanner scan = new Scanner(fis);

        Birthday[] saves= list.saves;
        int index= list.index;

        scan.nextLine();

        while (scan.hasNext()) {

            Birthday save = new Birthday();

            String inputFile = scan.nextLine();
            String[] separation = inputFile.split(" ");

            String result = separation[0] + separation[1] + separation[2];
            save.result = result;

            saves[index++] = save;

            list.index=index;
        }

        scan.close();
        fis.close();

    }
}
