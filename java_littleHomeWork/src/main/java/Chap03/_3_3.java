package Chap03;

import java.util.Scanner;

public class _3_3 {
    public static void main(String[] args)
    {
        Scanner letter=new Scanner(System.in);
        System.out.println("请输入月份:");
        int i= letter.nextInt();
        String season="春";
        switch (i) {
            case 3, 4, 5:
                season = "春";
                break;
            case 6, 7, 8:
                season = "夏";
                break;
            case 9, 10, 11:
                season = "秋";
                break;
            case 12, 1, 2:
                season = "冬";
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.printf("%d月为%s季",i,season);
    }
}
