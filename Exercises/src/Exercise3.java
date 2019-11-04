import javafx.util.Pair;

/*
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
Implement car and cdr.
generische tests
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

        Pair<T, E> paar = new Pair<>(a, b);
        return paar;
    }

    /*public class Pair<T, U> {
        public final T t;
        public final U u;

        public Pair(T t, U u) {
            this.t= t;
            this.u= u;
        }
    }*/


    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        
        //Pair(key,value). Testvariablen.
        Pair<Integer, Integer> paar = new Pair<>(5, 6);
        String testString = "hallo";
        int testInt = 19;
        double testDouble = 5.5;
        char testChar = 'x';

        //Print paar
        //System.out.println(exercise3.cons(testInt, testString).getKey().toString()+ " " + exercise3.cons(testInt, testString).getValue().toString());


    }
}
