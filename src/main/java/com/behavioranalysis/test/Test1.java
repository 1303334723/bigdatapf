package com.behavioranalysis.test;

import java.util.Hashtable;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split("([a-z])\\1+");
        int num = 0;
        for(int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && !"".equals(strArr[i])) num++;
        }
        System.out.print(num);
    }
}
