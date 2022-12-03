package Chap03;

import java.util.Scanner;

public class _3_1 {public static void main(String[] args)
{
    Scanner letter = new Scanner(System.in);
    System.out.print("请输入一个a~e的小写字母:");
    String c = letter.next();
    char c1 = c.charAt(0);//读取第1个字符并强制转换为char类型
    switch(c1)
    {
        case 'a':
            System.out.println(c1 -= 32);
            break;
        case 'b':
            System.out.println(c1 -= 32);
            break;
        case 'c':
            System.out.println(c1 -= 32);
            break;
        case 'd':
            System.out.println(c1 -= 32);
            break;
        case 'e':
            System.out.println(c1 -= 32);
            break;
        default:
            System.out.println("other");
    }
}
}
