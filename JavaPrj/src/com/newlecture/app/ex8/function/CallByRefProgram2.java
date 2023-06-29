//package com.newlecture.app.ex8.function;
//
//import com.newlecture.app.ex9.struct.NumList;
//
//public class CallByRefProgram2 {
//    public static void main(String[] args) {
//
//        NumList numList = new NumList();
//
//        numList.nums = createNums();
//        numList.index =0;
//
//        inputNums(numList);//Call By Value(index)
//
//        //nums 배열의 값 출력
//        printNums(numList);//value, Call By Ref
//    }
//
//    public static void printNums(NumList numList) {
//        int size = numList.index;
//        int[] nums=numList.nums;
//
//        for (int i = 0; i < size; i++)
//            System.out.printf("%d ", nums[i]);
//    }
//
//    public static void inputNums(int[] nums, int index) {
//        int[] nums =numList.nums;
//        int index =0;
//
//        nums[index] = 20;
//        index++;
//
//        nums[index] = 30;
//        index++;
//
//        nums[index] = 90;
//        index++;
//
//
//
//
//
//    }
//
//    public static int[] createNums() {
//        return new int[10];
//    }
//}
