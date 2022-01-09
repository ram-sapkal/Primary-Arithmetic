package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeryArithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        int sz = num1.length()>num2.length()?num1.length():num2.length();
        int fn[]=new int[sz],sn[]=new int[sz];
        Arrays.fill(fn,0);
        Arrays.fill(sn,0);
        while((Integer.parseInt(num1))!=0 && (Integer.parseInt(num2))!=0){
                for(int i=num1.length()-1;i>=0;i--){
                    fn[i]=Integer.parseInt(String.valueOf(num1.charAt(i)));
                }
                for(int i=num2.length()-1;i>=0;i--){
                sn[i]=Integer.parseInt(String.valueOf(num2.charAt(i)));
                }
                int count=0;
                for(int i=sz-1;i>=0;i--){
                    int c = (fn[i]+sn[i]>=10)?1:0;
                    if(c==1){count++;}
                }
            System.out.println(count==0?"No Carry Operation":""+count+" Carry Operation");
            num1=sc.next();
            num2=sc.next();
        }
    }
}
