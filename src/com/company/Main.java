package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
   /*     HashMap<String,String> skill = new HashMap<>();

        skill.put("Java developer", "Entry level");
        skill.put("hello","hello");*/

      Person person = new Person();

/*      person.skill.setSkills(skill);

        System.out.println(person.skill.toString());
        */

        ArrayList<String> school = new ArrayList<>();
        ArrayList<String>degree = new ArrayList<>();
        ArrayList<Integer>date = new ArrayList<>();

        school.add("umbc");
        degree.add("IS");
        date.add(2018);

        school.add("umd");
        degree.add("Cmsc");
        date.add(2019);

        person.education.setDate(date);
        person.education.setDegree(degree);
        person.education.setSchool(school);

        System.out.println(person.education.toString());

    }
}
