package Chap03;

public class _3_7 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int b = i / 100;//百位
            int s = i / 10 % 10;//十位
            int g = i % 10;//个位
            if (i == b * b * b + s * s * s + g * g * g) {
                System.out.println(i);
            }
        }
    }
}
