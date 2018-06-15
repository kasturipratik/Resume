package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        Scanner input = new Scanner(System.in);

        //storing person information
        String name="",email="";

        //storing skills in key and values as skills and ratings
        HashMap<String,String> skills = new HashMap<>();

        //storing education information
        ArrayList<String> school = new ArrayList<>();
        ArrayList<String>degree = new ArrayList<>();
        ArrayList<Integer>date = new ArrayList<>();

        //storing job description
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String>locations = new ArrayList<>();
        ArrayList<String>dates = new ArrayList<>();
        ArrayList<String> duty1s = new ArrayList<>();
        ArrayList<String>duty2s = new ArrayList<>();


        p("Welcome to the resume builder");

            p("Enter your name:");
            name = input.nextLine();
            p("Enter your email");
            email = input.nextLine();

            person.setEmail(email);
            person.setName(name);

            educationAdd(school,degree,date);
            workList(titles,locations,dates,duty1s,duty2s);
            skillsList(skills);

            person.skill.setSkills(skills);

            person.jobs.settitle(titles);
            person.jobs.setLocation(locations);
            person.jobs.setDuty2(duty2s);
            person.jobs.setDuty1(duty1s);
            person.jobs.setDate(dates);

            person.education.setDate(date);
            person.education.setSchool(school);
            person.education.setDegree(degree);

            p(person.toString());
            p("EDUCATION\n::::::::::::::::::::::::::::::::::::::::::::::::");
            p(person.education.toString());
            p("WORK EXPERIENCE\n::::::::::::::::::::::::::::::::::::::::");
            p(person.jobs.toString());
            p("SKILLS \n:::::::::::::::::::::::::::::::::::::::::");
            p(person.skill.toString());
    }

    public static void educationAdd(ArrayList<String> school, ArrayList<String> degree, ArrayList<Integer>date){

        Scanner input= new Scanner(System.in);
        Person person = new Person();
        String option="";
        int count =1;
        p("Enter your education History");
        do{

            p("Enter field of study: ");
            String degrees = input.nextLine();
            p("Enter School Name: ");
            String schools = input.nextLine();
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
        String option="";
        p("Do you want to add your work experience(y/n)");
        String work =input.nextLine();
        while(!work.equalsIgnoreCase("n")){
         p("Enter your job title: ");
         String title = input.nextLine();
         p("Enter your job location: ");
         String location = input.nextLine();
         p("Enter your job date");
         String date = input.nextLine();
         p("Enter your main duty:");
         String duty1 = input.nextLine();
         p("Enter your secondary duty: ");
         String duty2 = input.nextLine();

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
         p("Do you want to add more jobs(y/n):");
         work = input.nextLine();
         p(":::::::::::::::::::::::::::::::::::::::::::::::");

        }
    }

    public static void skillsList(HashMap<String, String> skills){
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        int count =1;
        String option ="";
        p("Please provide your skills");
        do{
            p("Enter your skill:");
            String skill = input.nextLine();
            p("Enter your rating:");
            String rating = input.nextLine();

            skills.put(skill,rating);
            person.skill.setSkills(skills);

            count++;
            p("Do you want to add more skills (y/n)");
            option = input.nextLine();
            p(":::::::::::::::::::::::::::::::::::::::");
        }while(!option.equalsIgnoreCase("n"));
    }


    public static void p(String s){
        System.out.println(s);
    }
}
