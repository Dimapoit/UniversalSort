/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.tyaa.universalsort.ComparationRule;
import org.tyaa.universalsort.Sort;

/**
 *
 * @author student
 */
public class JavaOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(1);
        list.add(-15);
        list.add(100);
        list.add(0);
        list.add(12);
        
        List<Person> persons = new ArrayList();
        persons.add(new Person(1, "n1", 30));
        persons.add(new Person(3, "a1", 25));
        persons.add(new Person(2, "z1", 35));
        persons.add(new Person(4, "n1", 40));
        persons.add(new Person(5, "a1", 35));
        persons.add(new Person(6, "z1", 55));
        
        
        Sort.bubbleSort(persons, (o1, o2) -> {
            return (((Person)o1).name).compareTo(((Person)o2).name);
        },
           (o1, o2) -> {
            return ((Person)o1).age - ((Person)o2).age;
        });
        
        persons.forEach((p) -> {
            System.out.println(p);
        });
    }
    
}
