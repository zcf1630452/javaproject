/**
 * Created by Administrator on 2017/2/24.
 */
public class hei {
    public static void main(String[]args) {
        char ch = 'a';
        int a = 20;
        double d, c = 2.5;
        d = a + c;
        int f = 50;
        if (f > a) System.out.println("大");
        else System.out.println("小");
        System.out.println("" + a);
        System.out.println("a+c+a=" + (d + a));
        System.out.println("" + (ch - 35));
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println("*");
            }System.out.println("");
        }
    }}