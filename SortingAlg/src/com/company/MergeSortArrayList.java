package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Merge-Sort Sort Algorithmus mit ArrayList als Datenstruktur in O(n * log(n)). Zählt auch Fehlstände der Elemente in konstanter Zeit.
public class MergeSortArrayList {
    private int fehlstand = 0;

    /**
     * Rekursive Funktion, die ArrayList übergeben bekommt und diese dann in zwei Hälfte splittet und diese rekursiv weiter bis auf
     * 1-Elementige Teilmengen aufteilt. Ruft dann damit Funktion Merge auf.
     * @param array = Übergabearray
     * @return sortiertes Array
     */
    public ArrayList<Integer> mergesort(List<Integer> array){
        //Falls Array nur 1 Element hat, nichts zu sortieren
        if(array.size() <= 1) return new ArrayList<>(array);
        //Mittleren Index finden. Da erstes Element = 0 -> rundet auf.
        int middle = array.size()/2;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i = 0; i < middle; i++){
            left.add(array.get(i));
        }
        for(int i = 0; i < middle; i++) {
            right.add(array.get(middle+i));
        }
        //Für ungerade Arrays noch letztes Element der rechten Seite hinzufügen.
        if(array.size() % 2 != 0){
            right.add(array.get(middle+middle));
        }
        left = mergesort(left);
        right = mergesort(right);
        return merge(left,right);

    }

    /**
     * Iterative Funktion, die beide übergebenen Arrays in eine neue Arraylist einfügt und die Elemente dabei an die richtige Stelle schiebt.
     * @param a1 = linkes Teilarray
     * @param a2 = rechtes Teilarray
     * @return sortiertes Array
     */
    public ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> newArr = new ArrayList<>();
        int indexL = 0;
        int indexR = 0;
        int fehlstand = 0;

        while (indexL< a1.size() && indexR < a2.size()){
            if(a1.get(indexL) < a2.get(indexR)) {
                newArr.add(a1.get(indexL));
                indexL += 1;
            } else{
                newArr.add(a2.get(indexR));
                indexR += 1;
                fehlstand += 1;
                //Addiere Fehlstände
                countFehlstand(fehlstand);
            }
        }
        while (indexL < a1.size()){
            newArr.add(a1.get(indexL));
            indexL += 1;
        }
        while (indexR < a2.size()){
            newArr.add(a2.get(indexR));
            indexR += 1;
        }
        return newArr;
    }

    /**
     * Zähle Fehlstände im Array
     * @param zahl = Fehlstand pro Schleifendurchlauf. Rekursiv, deswegen etwas verwirrend.
     */
    public void countFehlstand(int zahl){
        fehlstand = fehlstand+zahl;
    }


    public static void main(String[] args) {
        MergeSortArrayList mergeSortArrayList = new MergeSortArrayList();

        List<Integer> array = new ArrayList<>();
        //Scanner für Benutzereingabe. Stoppt bei leerer Eingabe.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dynamisches Array mit Integer Werten füllen. Leere Eingabe zum Beenden.");
        System.out.print("Eingeben: ");
        for(String line = scanner.nextLine(); !line.isEmpty(); line = scanner.nextLine()){
           System.out.print("Eingeben: ");
           int k = Integer.parseInt(line);
           array.add(k);
        }
        
        System.out.println(mergeSortArrayList.mergesort(array));
        System.out.print("Fehlstände: " + mergeSortArrayList.fehlstand);

    }
}
