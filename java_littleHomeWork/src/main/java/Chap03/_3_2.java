package Chap03;

import java.util.Scanner;

public class _3_2 {public static void main(String[] args)
{
    Scanner letter=new Scanner(System.in);
    System.out.println("请输入你的分数:");
    int i= letter.nextInt();
    if(i>=60)System.out.println("合格");
    else System.out.println(("不合格"));
}
}
