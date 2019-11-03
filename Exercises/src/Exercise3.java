import javafx.util.Pair;

/*
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
Implement car and cdr.
generische tests
 */
public class Exercise3 {

    public <T> Pair cons(Pair<T, T> a){
        return a;
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


    }
}
