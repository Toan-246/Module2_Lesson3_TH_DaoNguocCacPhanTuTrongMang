package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int size;
       int[]arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("size nhập không hợp lệ");
        }
        while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println(" Nhập phần tử thứ" + (i+1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.println("mảng đảo ngược");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
