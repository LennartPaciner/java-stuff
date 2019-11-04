import javafx.util.Pair;

/*
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
Implement car and cdr.
 */
public class Exercise3 {

    /**
     * Generische Funktion um ein Tupel zu bilden.
     * @param a = erstes Argument
     * @param b = zweites Argument
     * @param <T>
     * @param <E>
     * @return ein Tupel aus übergebenen Argumenten
     */
    public <T, E> Pair cons(T a, E b){
        return new Pair<>(a, b);
    }

    /**
     * Bekomme erstes Element von übergebenem generischen Tupel
     * @param a
     * @param <T>
     * @return erstes Element
     */
    public <T> T car(Pair<T, T> a){
        return a.getKey();
    }

    /**
     * Bekomme zweites Element von übergebenem generischen Tupel
     * @param a
     * @param <T>
     * @return zweites Element
     */
    public <T> T cdr(Pair<T, T> a){
        return a.getValue();
    }


    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();

        //Pair(key,value). Testvariablen.
        String testString = "hallo";
        int testInt = 19;
        double testDouble = 5.5;
        char testChar = 'x';

        //Testaufrufe
        Pair paar = exercise3.cons(testString, testDouble);
        Pair paar2 = exercise3.cons(testChar, testInt);
        System.out.println(exercise3.car(paar2));
        System.out.println(exercise3.cdr(paar2));

        //Print paar
        //System.out.println(exercise3.cons(testInt, testString).getKey().toString()+ " " + exercise3.cons(testInt, testString).getValue().toString());


    }
}
