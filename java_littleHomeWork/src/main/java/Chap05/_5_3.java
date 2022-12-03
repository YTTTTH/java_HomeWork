package Chap05;

import java.util.Scanner;

public class _5_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一段十六进制数");
        String st=scanner.next();
        int oct=0;//记录十进制数
        int weight=0;//记录权位
        for(int i=st.length()-1;i>=0;i--){
            char ch=st.charAt(i);
            int o=0;
            if(ch<='9'&&ch>='0') o=Integer.parseInt(""+ch);
            else if(ch<='Z'&&ch>='A')o=10+(ch-'A');
            else o=10+(ch-'a');
            oct+=o*Math.pow(16,weight);
            weight++;
        }
        System.out.println("十进制数为："+oct);
    }
}
