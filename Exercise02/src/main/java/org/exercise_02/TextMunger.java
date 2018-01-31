package org.exercise_02;

import java.util.*;

public class TextMunger {

    public static void main(String args[]){
        System.out.println(mungerText(args[0]));

    }

    public static String mungerText(String text){
        StringBuilder r = new StringBuilder(text.length());
        //Break text on words using word boundary regex
        String[] words = text.split("\\b");

        for(String w:words){
            if(w.length()>3){
                //scramble
                List<String> x = new LinkedList<String>(Arrays.asList(w.substring(1,w.length()-1).split("")));
                StringBuilder aux = new StringBuilder(w.length());
                aux.append(w.substring(0,1));
                while(x.size()!=0){
                    aux.append(x.remove((int)(Math.random()*x.size())));
                }
                aux.append(w.substring(w.length()-1));
                r.append(aux.toString());
            } else {
                r.append(w);
            }
        }
        return r.toString();
    }

}
