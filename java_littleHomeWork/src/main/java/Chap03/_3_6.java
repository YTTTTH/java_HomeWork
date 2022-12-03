package Chap03;

public class _3_6 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("总和:" + sum + "个数:" + count);
    }
}
