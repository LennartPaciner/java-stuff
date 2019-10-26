package com.company;
import java.util.Scanner;


public class FehlstandArray {

    public int fehlstand(int n, int[] array){
        int konstante = 0;
        for(int i = 1; i < n; i++){
            int value = array[i];
            int j = i;
            while (j > 0 && array[j-1] > value){
                array[j] = array[j-1];
                konstante = konstante +1;
                j = j-1;
            }
            array[j] = value;
        }
        return konstante;
    }

    public static void main(String[] args) {
        FehlstandArray main = new FehlstandArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");
        int i = scanner.nextInt();
        int[] a = {4,3,2,1};
        int arr = main.fehlstand(i, a);

        System.out.println(arr);
    }
}
