package com.automobile;

import com.automobile.twowheeler.hero;
import com.automobile.twowheeler.honda;

public class ANkurmain {
    public static void main(String[] args) {
        hero hero = new hero("Hero i-smart 110 2s", "MP65MD5060", "Ajay Singh", 90);
        System.out.println(hero.getModelName());
        System.out.println(hero.getOwnerName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getSpeed()+" kmph");
        hero.radio();

        System.out.println();

        honda honda = new honda("Honda CB Hornet 160R", "M15FZ5101", "Vijay Singh", 110);
        System.out.println(honda.getModelName());
        System.out.println(honda.getOwnerName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getSpeed()+" kmph");
        honda.cdplayer();


    }
}
