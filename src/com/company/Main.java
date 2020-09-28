package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]  = new int[n];
        int max = 0;
        for (int j =0; j < n; j++){
            a[j] = scan.nextInt();
        }
        for (int i = 0; i < n;i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
        
    }
}
