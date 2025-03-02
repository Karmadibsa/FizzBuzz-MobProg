package org.example;

//Écrire un programme qui affiche les nombres de 1 à 100
//Pour les multiples de 3, afficher "Fizz" au lieu du nombre
//Pour les multiples de 5, afficher "Buzz" au lieu du nombre
//Pour les multiples de 3 et 5, afficher "FizzBuzz" au lieu du nombre

import java.util.ArrayList;

public class FizzBuzz {

    public String convert(int number) {

        boolean modulo3 = estModulo3(number);
        boolean modulo5 = estModulo5(number);
        if (modulo3 && modulo5) {
            return "FizzBuzz";
        } else if (modulo3) {
            return "Fizz";
        } else if (modulo5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public ArrayList initArray(int number) {
        ArrayList monTableau = new ArrayList();
        for (int i = 1; i <= number; i++) {
            monTableau.add(i);
        }
        return monTableau;
    }

    public boolean estModulo3(int number) {
        return number % 3 == 0;
    }

    public boolean estModulo5(int number) {
        return number % 5 == 0;
    }
}