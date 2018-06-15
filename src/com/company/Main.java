package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        Scanner input = new Scanner(System.in);

        String name="",email="";
        HashMap<String,String> skills = new HashMap<>();
        HashMap<String, String>user = new HashMap<>();
        ArrayList<String> school = new ArrayList<>();
        ArrayList<String>degree = new ArrayList<>();
        ArrayList<Integer>date = new ArrayList<>();

        p("Welcome to the resume builder");

            p("Enter your name:");
            name = input.next();
            p("Enter your email");
            email = input.next();

            person.setEmail(email);
            person.setName(name);

            educationAdd(school,degree,date);

    }
    public static void educationAdd(ArrayList<String> school, ArrayList<String> degree, ArrayList<Integer>date){

        Scanner input= new Scanner(System.in);
        Person person = new Person();
        String option="";
        int count =1;
        p("Enter your education History");
        do{

            p("Enter field of study: ");
            String degrees = input.next();
            p("Enter School Name: ");
            String schools = input.next();
            p("Enter the date of graduation (YYYY)");
            int dates = input.nextInt();
            input.nextLine();

            school.add(schools);
            degree.add(degrees);
            date.add(dates);

            person.education.setDegree(degree);
            person.education.setSchool(school);
            person.education.setDate(date);
            count++;
            p("Do you want to add more (y/n)");
            option = input.nextLine();
            p("::::::::::::::::::::::::::::::::::");
        }while(!option.equalsIgnoreCase("n") && count <=10);

    }

    public static void workList(ArrayList<String>titles, ArrayList<String> locations, ArrayList<String>
                                dates, ArrayList<String> duty1s, ArrayList<String> duty2s){

        Person person = new Person();
        Scanner input= new Scanner(System.in);
        int count =1;
        String option=""
        p("Do you want to add your work experience");
        String work =input.nextLine();
        while(!work.equalsIgnoreCase("n")){
         p("Enter your job title: ");
         String title = input.next();
         p("Enter your job location: ");
         String location = input.next();
         p("Enter your job date");
         String date = input.next();
         p("Enter your main duty:");
         String duty1 = input.next();
         p("Enter your secondary duty: ");
         String duty2 = input.next();

         titles.add(title);
         locations.add(location);
         dates.add(date);
         duty1s.add(duty1);
         duty2s.add(duty2);

         person.jobs.setDate(dates);
         person.jobs.setDuty1(duty1s);
         person.jobs.setDuty2(duty2s);
         person.jobs.setLocation(locations);
         person.jobs.settitle(titles);

         count++;
         p("Do you want to add more jobs:");
         work = input.nextLine();

        }


    }


    public static void p(String s){
        System.out.println(s);
    }
}
