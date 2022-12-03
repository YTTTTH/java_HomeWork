package Chap03;

import java.util.Scanner;

public class _3_4 {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.println("请输入2014年的月份和日期");
        int m = letter.nextInt();
        int d = letter.nextInt();
        if (m == 1 & d < 32 || m == 2 && d < 29 || m == 3 && d < 32 || m == 4 && d < 31 || m == 5 && d < 32 || m == 6 && d < 31
                || m == 7 && d < 32 || m == 8 && d < 32 || m == 9 && d < 31 || m == 10 && d < 32 || m == 11 && d < 31
                || m == 12 && d < 32) {

            switch (m) {
                case 1:
                    System.out.println("今天是2014年的第" + d + "天！");
                    break;
                case 2:
                    System.out.println("今天是2014年的第" + (d + 31) + "天！");
                    break;
                case 3:
                    System.out.println("今天是2014年的第" + (d + 59) + "天！");
                    break;
                case 4:
                    System.out.println("今天是2014年的第" + (d + 90) + "天！");
                    break;
                case 5:
                    System.out.println("今天是2014年的第" + (d + 120) + "天！");
                    break;
                case 6:
                    System.out.println("今天是2014年的第" + (d + 151) + "天！");
                    break;
                case 7:
                    System.out.println("今天是2014年的第" + (d + 181) + "天！");
                    break;
                case 8:
                    System.out.println("今天是2014年的第" + (d + 212) + "天！");
                    break;
                case 9:
                    System.out.println("今天是2014年的第" + (d + 243) + "天！");
                    break;
                case 10:
                    System.out.println("今天是2014年的第" + (d + 273) + "天！");
                    break;
                case 11:
                    System.out.println("今天是2014年的第" + (d + 304) + "天！");
                    break;
                default:
                    System.out.println("今天是2014年的第" + (d + 334) + "天！");
                    break;

            }

        }
        else{
            System.out.println("输入错误");
        }
    }
}
