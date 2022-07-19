package Main;

import java.util.Scanner;

public class 判断一个数是不是2的整数次方 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if((n&(n-1))==0)
            System.out.println("是的");
        else
            System.out.println("不是的");
    }
}
