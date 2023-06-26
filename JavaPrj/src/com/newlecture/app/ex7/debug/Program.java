package com.newlecture.app.ex7.debug;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JavaPrj/res/ex07/data.txt");
        Scanner fscan = new Scanner(fis);

        for(int i=0;i<6;i++) {
            int num = fscan.nextInt();
            System.out.printf("%d ",num);
        }

        fscan.close();
        fis.close();
    }
}
