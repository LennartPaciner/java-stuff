import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 */
public class Exercise1 {
    private int kombination = 0;

    /**
     * Falls zwei Zahlen aus übergebener Liste k als Summe ergeben, werden sie gefunden.
     * @param liste
     * @param zahl
     * @return true falls möglich
     */
    private boolean getK(List<Integer> liste, int zahl){
        for(int i = 0; i < liste.size(); i++){
            for(int j = 1+i; j < liste.size(); j++){
                if(liste.get(i) + liste.get(j) == zahl){
                    kombination = liste.get(i) + liste.get(j);
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        //Initialisiere Liste
        List<Integer> array = Arrays.asList(10, 15, 4, 7, 1);

        System.out.println(exercise1.getK(array, 9) + " : " + exercise1.kombination);

        //Unnötig komplizierte Möglichkeit das Eingabearray in einer Zeile auszugeben
        String leerstelle = " ";
        String[] carray = new String[array.size()];
        for(int i = 0; i < array.size(); i++){
            carray[i] = array.get(i).toString();
        }
        Arrays.stream(carray).map(s -> s + leerstelle).forEach(System.out::print);
        System.out.println(" ");

        //Andere komische Möglichkeit das Array zu printen
        System.out.print(Arrays.toString(array.toArray()).replace(", ", " ").replace("[", "").replace("]", ""));

    }
}
