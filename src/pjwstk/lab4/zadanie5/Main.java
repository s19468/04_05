/*
    Zadanie 5.
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie5;

public class Main {

    public static void main(String[] args) {
        int number = 1346;

        int c = 0;
        int a;
        int tempNumber;

        tempNumber = number;
        while(number > 0)
        {
            a = number % 10;
            number = number / 10;
            c = c + (a * a * a);
        }
        if(tempNumber == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
