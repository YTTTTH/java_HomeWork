package Chap05;


import java.util.Scanner;

public class _5_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符");
        char ch=scanner.next().charAt(0);
        System.out.println("请输入一个字符串");
        String st=scanner.next();
        int index=-1;//记录最后一次出现的位置
        for(int i=0;i<st.length();i++){
            if(ch==st.charAt(i))index=i+1;
        }
        if(index>0) System.out.println("字符\""+ch+"\"最后一次出现的位置为："+index);
        else System.out.println("Not found");
    }

}
