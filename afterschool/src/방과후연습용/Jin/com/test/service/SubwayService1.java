package 방과후연습용.Jin.com.test.service;

import java.util.Scanner;

public class SubwayService1 {
    private String[] trainStations = {"합정", "홍대입구", "신촌", "이대", "아현"};
    private boolean[] trainAvailability = new boolean[4];
    private int[] passengerCount = new int[4];
    private int currentStationIndex = 0;

    private String[][] passengerStations = new String[4][4];

    public SubwayService1() {
        for (int i = 0; i < trainAvailability.length; i++)
            trainAvailability[i] = true;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String menu;

        do {
            System.out.println("=================================");
            System.out.println("현재역은 " + trainStations[currentStationIndex] + "입니다.");
            System.out.println("=================================");
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.탑승 2.상세보기 3.이동 9.종료");

            menu = sc.nextLine();

            switch (menu) {
                case "1":
                    join();
                    break;
                case "2":
                    status();
                    break;
                case "3":
                    move();
                    break;
                case "9":
                    System.out.println("열차운행을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        } while (!menu.equals("9"));
    }

    private void join() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- 탑승가능 현황 ----");

        for (int i = 0; i < trainAvailability.length; i++) {
            if (passengerCount[i] <= 3) {
                trainAvailability[i] = true;
                System.out.println((i + 1) + "호차 : 가능");
            } else {
                System.out.println((i + 1) + "호차 : 불가능");
            }
        }

        System.out.println("어느 열차에 탑승하시겠습니까?");
        System.out.println("1.1호차 2.2호차 3.3호차 4.4호차");

        int trainIndex = Integer.parseInt(sc.nextLine()) - 1;

        if (trainAvailability[trainIndex] && passengerCount[trainIndex] <= 3) {
            System.out.println("목적지를 선택해 주세요.");

            //현재역 제외한 역 출력
            for (int i = 0; i < trainStations.length; i++) {
                if (currentStationIndex == i)
                    continue;
                System.out.print((i + 1) + "." + trainStations[i] + " ");
            }
//
            //목적지 입력
            int destinationIndex = Integer.parseInt(sc.nextLine()) - 1;
            int incArray = passengerCount[trainIndex];

            if (destinationIndex != currentStationIndex) {
                for (int i = 0; i < 4; i++) {
                    if (passengerStations[trainIndex][i] == null) {
                        passengerStations[trainIndex][i] = trainStations[destinationIndex];
                        passengerCount[trainIndex]++;
                        break;
                    }
                }

                System.out.println("탑승되었습니다.");

                if (passengerCount[trainIndex] == 4) {
                    trainAvailability[trainIndex] = false;
                }
            } else {
                System.out.println("목적지로 현재역은 선택할 수 없습니다. 탑승이 불가능합니다.");
            }
        } else {
            System.out.println("정원이 가득 찬 차량입니다. 탑승이 불가능합니다.");
        }
    }

    private void status() {
        System.out.println("---- 열차 현황 ----");

        for (int i = 0; i < passengerStations.length; i++) {
            System.out.print((i + 1) + "호차 : ");
            for (int j = 0; j < passengerStations.length; j++)
                if (!(passengerStations[i][j] == null)) {
                    System.out.printf("[%s]", passengerStations[i][j]);
                }
            System.out.println();
        }
    }

    private void move() {
        if (currentStationIndex >= 4)
            currentStationIndex = 0;
        else
            currentStationIndex++;

        int out = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (trainStations[currentStationIndex].equals(passengerStations[i][j])) {
                    out++;
                    passengerStations[i][j] = null;
                    passengerCount[i]--;
                }

        System.out.printf("%d 명이 하차했습니다.\n\n", out);

    }
}