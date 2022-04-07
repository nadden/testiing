package com.example.test;

import java.util.Comparator;

public class KundeComparator implements Comparator<KundeFilm> {

    public int compare(KundeFilm k1, KundeFilm k2){

        return k1.getEtternavn().compareTo(k2.getEtternavn());
    }

}
