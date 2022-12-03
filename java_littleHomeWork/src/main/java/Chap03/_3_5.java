package Chap03;

public class _3_5 {
    public static void main(String[] args) {
        int res=0;
        for(int i =1;i<=100;i++){
            if(i%2==1){
                res+=i;
            }
        }
        System.out.println("1~100之间所有奇数的和为"+res);
    }
}
