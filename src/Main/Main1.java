package Main;

import java.util.*;

public class Main1 {
   static Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
       String s=in.nextLine();
       int x=in.nextInt(),p=in.nextInt();
       for(int i=x;i<s.length();i+=p){
           System.out.print(s.charAt(i));
       }
    }
}

