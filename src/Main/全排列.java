package Main;
import java.util.Scanner;
public class 全排列 {
    public static int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
    public static int sum=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Solution(0,n-1);
        System.out.println(sum%1007);
    }
    public static void Solution(int begin,int end){
        if(begin==end){  //形成一个全排列
            for(int i=0;i<end;i++){
                for(int j=i+1;j<=end;j++){
                    if(a[i]>a[j])
                        sum++;
                }
            }

        }
        else{
            for(int i=begin;i<=end;i++){
                int temp=a[i];
                a[i]=a[begin];
                a[begin]=temp;
                Solution(begin+1,end);
                temp=a[i];
                a[i]=a[begin];
                a[begin]=temp;
            }
        }

    }
}