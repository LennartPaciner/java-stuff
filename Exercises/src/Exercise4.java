/*
Huffman-Code als Baum
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class HuffmanKnoten {
    char a;
    HuffmanKnoten links;
    HuffmanKnoten rechts;
    HuffmanKnoten freq;

}
/*
function huffman (A)
1 // A i s t Array von Knoten
2 // Beg inn : Array von B l a e t t e r n
3 i f |A| = 1
4 return A [ 1 ]
5 u := e x t r a c t mi n (A)
6 v := e x t r a c t mi n (A)
7 w := new node
8 w. l e f t := u
9 w. r i g h t := v
10 w. f r e q := u . f r e q + v . f r e q
11 i n s e r t (A , w)
12 return huffman (A)

function e x t r a c t mi n (A)
1 u := argmin {x.freq | x ∈ A}
2 A := A \ {u}
3 return u

 */


public class Exercise4 {

    private char getMin(String A){
        char[] array = A.toCharArray();
        char[] f = new char[array.length];
        for(char c: array){

        }

        for(int i = 0; i < array.length; i++){
            f[array[i]] +=1;
        }
        return 'a';
    }

    private char extractmin(String A){
        char u = getMin(A);
        return 'a';
    }

    private static String huffman(String A){
        if(A.length() == 1){
            return A;
        }
        return "s";
    }





    public static void main(String[] args) {
        String eingabe = "bananensaft";
        char[] ch = eingabe.toCharArray();
        System.out.print(ch.length);


        System.out.println();

    }
}
