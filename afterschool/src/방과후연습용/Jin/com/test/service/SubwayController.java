package 방과후연습용.Jin.com.test.service;

import java.io.IOException;

public class SubwayController {
    public static void main(String[] args) throws IOException {
        // 지하철 만들기
        // 역은 총 5개로 순환열차이다.(합정, 홍대입구, 신촌, 이대, 아현)
        // 차량은 총 4량, 각 차량당 탑승가능인원 4명
        // 탑승 시 목적지 지정. 목적지도착 시 자동하차
        // 이동시 1개역씩 이동
        SubwayService1 ss = new SubwayService1();

        System.out.println("---- Welcome Subway ----");

        ss.run();
    }
}
