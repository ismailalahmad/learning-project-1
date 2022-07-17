package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean  is(String a[],String x){
        for (int i = 0; i < a.length; i++) {
            if(x==a[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String text;
        text=in.nextLine();
        String a[]=new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
          if(is(a,text.charAt(i)+"")){
          }else {
              a[i]=text.charAt(i)+"";
          }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
