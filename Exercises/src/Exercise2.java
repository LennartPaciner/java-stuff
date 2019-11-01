/*
Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public List<Integer> produkt(List<Integer> liste){
        List<Integer> array = new ArrayList<>();
        int ergebnis = 1;
        for(int i = 0; i < liste.size(); i++){
            ergebnis *= liste.get(i);
        }
        for(int i = 0; i < liste.size(); i++){
            array.add(ergebnis / liste.get(i));
        }
        System.out.print(Arrays.toString(array.toArray()).replace(", ", " ").replace("[", "").replace("]", ""));
        return liste;
    }











    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);

        exercise2.produkt(array);

    }
}
