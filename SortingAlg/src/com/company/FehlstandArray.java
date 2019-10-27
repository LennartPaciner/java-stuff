package com.company;
import java.util.Scanner;

//Soriert Eingabearray in O(n^2) mittels Insertionsort und zählt Fehlstände in konstanter Zeit mit.
public class FehlstandArray {

    /**
     * Sortiert Array mit Insertion-Sort und zählt Fehlstände
     * @param n = Arraysize
     * @param array = Eingabearray
     * @return Fehlstände als Integer
     */
    public int fehlstandArray(int n, int[] array){
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
        //Scanner um Benutzereingaben zu verwenden.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arraygröße eingeben: ");
        int i = scanner.nextInt();
        int[] a = new int[i];
        //Fülle Array mit Integer Werten.
        for(int j = 0; j < i; j++){
            System.out.print((j+1) + "te Zahl: ");
            int k = scanner.nextInt();
            a[j] = k;

        }
        int fehlstand = main.fehlstandArray(i, a);
        //Gebe sortiertes Array aus.
        for(int j = 0; j < i; j++){
            System.out.print(a[j]);
        }

        System.out.println(" Fehlstände: " + fehlstand);
    }
}
