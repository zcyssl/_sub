package Main;

import java.util.Scanner;

public class 奇偶互换 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ou=n&0xaaaaaaaa; //保留偶数
        int ji=n&0x55555555;  //保留奇数
        System.out.println((ou>>1)^(ji<<1));
    }
}
