package Chap04;

public class _4_3 {
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        System.out.println("两矩阵相加为");
        showMaxi(maxiAdd(c,d));
        System.out.println("两矩阵相乘为");
        showMaxi(maxiMuti(c,d));
    }
    private static int [][]maxiAdd(int c[][],int d[][]){
        int a[][]=new int[c.length][c[0].length];
        for(int i=0;i< c.length;i++){
        for (int j=0;j< c.length;j++){
            a[i][j]=c[i][j]+d[i][j];
        }
    }
    return a;
}
private static int [][]maxiMuti(int c[][],int d[][]){
    int a[][]=new int[c.length][c[0].length];
    for(int i=0;i< c.length;i++){
        for (int j=0;j< c.length;j++) {
            for (int k = 0; k < c.length; k++) {

                a[i][j] += c[i][k]*d[k][j];
            }
        }
        }
    return a;
}
    private static void showMaxi(int a[][]){
        for (int i=0;i< a.length;i++){
            for (int j=0;j< a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
