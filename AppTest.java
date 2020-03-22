package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void tema() {
        Person[] persons = new Person[5];
        persons[1] = new Student("-Andreea");
        persons[2] = new Unemployed("-Maya");
        persons[3] = new Employee("-Andrei");
        persons[4] = new Student("Eduard");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        Person X = persons[2];
        persons[2] = new Employee("-Martin");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        System.out.println(X);
    }

}
