package Chap04;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class _4_1 {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[11];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr1[i] = new Random().nextInt(99 - 10 + 1) + 10;
        }
        sort(arr1);
        System.out.println("随机数组为");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("请输入一个整数");
        int num = letter.nextInt();
        for (int i = 0; i < 10; i++) {
            arr2[i] = arr1[i];
        }
        arr2[10] = num;
        sort(arr2);

        for (int i = 0; i < 11; i++) {
            System.out.println(arr2[i]);
        }
    }
}
