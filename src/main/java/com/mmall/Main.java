package com.mmall;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result=0;
        int n = in.nextInt();
        int k = in.nextInt();

        for(int i=k; i<= n; i++){
            for(int j=2; j<=n; j++){
                if(qiuyu(i,j) >= k){
                   result++;
                }
            }
        }
        System.out.println(result);

    }

    public static int qiuyu(int n, int b){
        String s = String.valueOf(n);

        int m = 0;

        for(int i=0; i<s.length();i++){
            m = ((m*10)%b+(s.charAt(i)-'0')%b)%b;

        }

        return m;

    }
}
