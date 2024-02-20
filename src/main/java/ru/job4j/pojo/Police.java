package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        Licence licence = new Licence();
        licence.setOwner("Roman Aleshkin");
        licence.setMddel("Toyota");
        licence.setCode("xx111x");
        licence.setCreated(new Date());

        System.out.println(licence.getOwner() + " has a car " + licence.getMddel() + " : " + licence.getCode());
    }
}
