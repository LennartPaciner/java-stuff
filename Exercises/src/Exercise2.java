import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.
*/
public class Exercise2 {

    /**
     * Mittels Division
     * @param liste
     * @return array mit ergebnissen
     */
    private List<Integer> produkt(List<Integer> liste){
        List<Integer> array = new ArrayList<>();
        int ergebnis = 1;
        for(int i = 0; i < liste.size(); i++){
            ergebnis *= liste.get(i);
        }
        //i aus dem ergebnis entfernen durch division
        for(int i = 0; i < liste.size(); i++){
            array.add(ergebnis / liste.get(i));
        }
        //printe array ohne klammern und komma
        System.out.print(Arrays.toString(array.toArray()).replace(", ", " ").replace("[", "").replace("]", ""));
        return liste;
    }

    /**
     * Ohne Division umgesetzt
     * @param liste
     * @return array mit ergebnissen
     */
    private List<Integer> ohneDiv(List<Integer> liste){
        List<Integer> array = new ArrayList<>();
        int ergebnis = 1;
        for(int i = 0; i < liste.size(); i++){
            for(int j = 0; j < liste.size(); j++){
                //stelle i überspringen
                if(i != j){
                    ergebnis *= liste.get(j);
                }
            }
            array.add(ergebnis);
            //ergebnis zurücksetzen um nächste stelle berechnen zu können
            ergebnis = 1;
        }
        System.out.print(Arrays.toString(array.toArray()).replace(", ", " ").replace("[", "").replace("]", ""));
        return liste;
    }








    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);

        exercise2.produkt(array);
        System.out.println("");
        exercise2.ohneDiv(array);

    }
}
