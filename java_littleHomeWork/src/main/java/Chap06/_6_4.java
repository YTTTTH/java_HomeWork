package Chap06;

import java.util.ArrayList;
import java.util.Scanner;

public class _6_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n=scanner.nextInt();
        if(n<=2)
            System.out.println("无效数字");
        for(int i=2;i<n+1;i++){
            boolean flag=true;
            for(int j:arrayList){//改进点
                if(i%j==0)//i不是质数
                {
                    flag=false;
                    break;
                }
            }
            if(flag)arrayList.add(i);


        }
        int n1=n;
        ArrayList<Integer> arrayList1=new ArrayList<Integer>();
        while(n1>2)
        {
            for(int i:arrayList)
            {
                if(n1%i==0)
                {
                    arrayList1.add(i);
                    n1=n1/i;
                    break;
                }
            }
        }
        System.out.print(n+"=");
        for(int i=0;i<arrayList1.size()-1;i++)
        {
            System.out.print(arrayList1.get(i)+"*");
        }
        System.out.print(arrayList1.get(arrayList1.size()-1));
}
}
