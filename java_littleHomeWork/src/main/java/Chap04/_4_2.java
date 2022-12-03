package Chap04;

public class _4_2 {
    public static void main(String[] args) {
        int[][] YH_Triangle = new int[10][];
        for(int i = 0; i < YH_Triangle.length; ++i) {
            YH_Triangle[i] = new int[i + 1];//每一行得到元素个数为一维下标加一
            YH_Triangle[i][0] = YH_Triangle[i][i] = 1;//第一个元素和最后一个元素都是1
            if (i > 1) {      //从第三行开始遍历
                for(int j = 1; j < YH_Triangle[i].length - 1; ++j) {
                    YH_Triangle[i][j] = YH_Triangle[i - 1][j - 1] + YH_Triangle[i - 1][j];
                }
            }
        }

        for(int i = 0; i < YH_Triangle.length; ++i) {
            for(int j = 0; j < YH_Triangle[i].length; ++j) {
                System.out.print(YH_Triangle[i][j] + " ");
            }

            System.out.println("");
        }

    }
}
