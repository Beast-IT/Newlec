package 방과후연습용.Jin.com.test.service;

import java.util.Scanner;

public class SubwayService {
    private static final int NUM_STATIONS = 5;
    private static final int NUM_TRAINS = 4;
    private static final int CAPACITY_PER_TRAIN = 4;
    private static final String[] STATIONS = {"합정", "홍대입구", "신촌", "이대", "아현"};

    private Scanner scanner;
    private String[] trains;
    private int[] destinations;
    private int currentStationIndex;

    public SubwayService() {
        scanner = new Scanner(System.in);
        trains = new String[NUM_TRAINS];
        destinations = new int[NUM_TRAINS];
        currentStationIndex = 0;
    }

    public void run() {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
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
                    System.out.println("열차 운행을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println("=================================");
        System.out.println("현재역은 " + STATIONS[currentStationIndex] + "입니다.");
        System.out.println("=================================");
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1. 탑승 2. 상세보기 3. 이동 9. 종료");
    }

    private void join() {
        System.out.println("---- 탑승가능 현황 ----");
        for (int i = 0; i < NUM_TRAINS; i++) {
            if (trains[i] == null) {
                System.out.println((i + 1) + "호차 : 가능");
            } else {
                System.out.println((i + 1) + "호차 : 불가능");
            }
        }

        int trainIndex = selectTrain();
        if (trainIndex == -1) {
            System.out.println("탑승 가능한 열차가 없습니다.");

        }

        int destinationIndex = selectDestination();
        if (destinationIndex == currentStationIndex) {
            System.out.println("목적지로 현재역은 선택할 수 없습니다.");

        }

        String destination = STATIONS[destinationIndex];
        trains[trainIndex] = destination;
        destinations[trainIndex] = destinationIndex;

        System.out.println("[" + (trainIndex + 1) + "호차]에 탑승하였습니다. 목적지는 " + destination + "입니다.");
    }

    private int selectTrain() {
        System.out.println("어느 열차에 탑승하시겠습니까?");
        for (int i = 0; i < NUM_TRAINS; i++) {
            System.out.print((i + 1) + "." + (i + 1) + "호차 ");
        }
        System.out.println();

        int trainIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // 버퍼 비우기

        if (trainIndex >= 0 && trainIndex < NUM_TRAINS && trains[trainIndex] == null) {
            return trainIndex;
        }

        return -1;
    }

    private int selectDestination() {
        System.out.println("목적지를 선택해 주세요.");
        for (int i = 0; i < NUM_STATIONS; i++) {
            if (i != currentStationIndex) {
                System.out.println((i + 2) + "." + STATIONS[i]);
            }
        }

        int destinationIndex = scanner.nextInt() - 2;
        scanner.nextLine(); // 버퍼 비우기

        return destinationIndex;
    }

    private void status() {
        System.out.println("---- 열차 현황 ----");
        for (int i = 0; i < NUM_TRAINS; i++) {
            System.out.print((i + 1) + "호차 : ");
            if (trains[i] != null) {
                System.out.print("[" + STATIONS[currentStationIndex] + "]");
                for (int j = currentStationIndex + 1; j <= destinations[i]; j++) {
                    System.out.print("[" + STATIONS[j] + "]");
                }
            }
            System.out.println();
        }
    }

    private void move() {
        int numPassengersExited = 0;
        for (int i = 0; i < NUM_TRAINS; i++) {
            if (trains[i] != null && destinations[i] == currentStationIndex) {
                trains[i] = null;
                numPassengersExited++;
            }
        }

        currentStationIndex = (currentStationIndex + 1) % NUM_STATIONS;

        System.out.println(numPassengersExited + "명이 하차하였습니다.");
        System.out.println("=================================");
        System.out.println("현재역은 " + STATIONS[currentStationIndex] + "입니다.");
        System.out.println("=================================");
    }
}