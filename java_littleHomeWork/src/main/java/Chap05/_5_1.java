package Chap05;

import java.util.Scanner;

public class _5_1 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String s1=new String();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i) ;
            s1=c+s1;
        }
        if(s.equals(s1)) System.out.println("该字符串是回文字符串");
        else System.out.println("该字符串不是回文字符串");
    }
}
