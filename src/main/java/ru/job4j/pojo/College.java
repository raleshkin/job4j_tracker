package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Roman");
        student.setSecondName("Aleshkin");
        student.setMiddleName("Vladimirovich");
        student.setGroup("402-F");
        student.setReceiptDate(new Date());

        System.out.println("Student name: " + student.getSecondName() + " " + student.getFirstName() + " " + student.getMiddleName() + System.lineSeparator()
            + "Group name: " + student.getGroup() + System.lineSeparator() + "Start date of training: " + student.getReceiptDate());
    }
}
