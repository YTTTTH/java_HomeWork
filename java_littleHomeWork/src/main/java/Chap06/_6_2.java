package Chap06;

import java.util.ArrayList;
import java.util.Scanner;

public class _6_2 {

        public static void main(String[] args) {
            ArrayList<Integer> arrayList=new ArrayList<Integer>();
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入一个数字");
            int n=scanner.nextInt();
            if(n<=2)
                System.out.println("无效数字");
            for(int i=2;i<n+1;i++){
                boolean flag=true;
                for(int j=2;j<Math.sqrt(i);j++){//改进点
                    if(i%j==0)//i不是质数
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)arrayList.add(i);


            }
            for(int a:arrayList){
                System.out.println(a);
            }

        }
    }
