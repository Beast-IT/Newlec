package 방과후연습용.Jin.com.test.service;

import java.util.Scanner;

class SubwayService {
    private String[] trainStations= {"합정", "홍대입구", "신촌", "이대", "아현"};
    private boolean[] trainAvailability = new boolean[4];
    private int[] passengerCount = new int[4];
    private int currentStationIndex = 0;

    public SubwayService() {
        resetTrainAvailability();
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
        boolean availableTrain = false;

        System.out.println("---- 탑승가능 현황 ----");

        for (int i = 0; i < trainAvailability.length; i++) {
            if (trainAvailability[i] && passengerCount[i] < 4) {
                availableTrain = true;
                System.out.println((i + 1) + "호차 : 가능");
            } else {
                System.out.println((i + 1) + "호차 : 불가능");
            }
        }

        if (!availableTrain) {
            System.out.println("탑승가능 열차가 없습니다.");
        }

        System.out.println("어느 열차에 탑승하시겠습니까?");
        System.out.println("1.1호차 2.2호차 3.3호차 4.4호차");

        int trainIndex = Integer.parseInt(sc.nextLine()) - 1;

        if (trainAvailability[trainIndex] && passengerCount[trainIndex] < 3) {
            System.out.println("목적지를 선택해 주세요.");

            for (int i = currentStationIndex + 1; i < trainStations.length; i++) {
                System.out.print((i + 1) + "." + trainStations[i]+" ");
            }

            int destinationIndex = Integer.parseInt(sc.nextLine()) - 1;

            if (destinationIndex >= currentStationIndex + 1 && destinationIndex < trainStations.length) {
                passengerCount[trainIndex]++;
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

        for (int i = 0; i < trainAvailability.length; i++) {
            System.out.print((i + 1) + "호차 : ");
            if (trainAvailability[i]) {
                String destinations = getDestinations(i);
                if (!destinations.isEmpty()) {
                    System.out.println(destinations);
                } else {
                    System.out.println("목적지 없음");
                }
            } else {
                System.out.println("운행 종료");
            }
        }
    }


    private String getDestinations(int trainIndex) {
        StringBuilder destinations = new StringBuilder();

        for (int i = currentStationIndex; i < currentStationIndex + passengerCount[trainIndex]; i++) {
            destinations.append("[").append(trainStations[i]).append("] ");
        }

        return destinations.toString().trim();
    }

    private void move() {
        int disembarkedCount = 0;
        int[] disembarkedPassengers = new int[4];

        for (int i = 0; i < passengerCount.length; i++) {
            if (passengerCount[i] > 0 && (currentStationIndex + passengerCount[i]) % trainStations.length == 0) {
                disembarkedPassengers[i] = passengerCount[i];
                disembarkedCount += passengerCount[i];
                passengerCount[i] = 0;
                trainAvailability[i] = true;
            }
        }

        System.out.println(disembarkedCount + "명이 하차하였습니다.");

        currentStationIndex = (currentStationIndex + 1) % trainStations.length;
        resetTrainAvailability();
    }





    private void resetTrainAvailability() {
        for (int i = 0; i < trainAvailability.length; i++) {
            trainAvailability[i] = true;
        }
    }
}