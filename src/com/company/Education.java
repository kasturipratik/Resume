package com.company;

import java.util.ArrayList;

public class Education {
    ArrayList<String> degree ;
    ArrayList<String> school;
    ArrayList<Integer> date;

    public Education() {

        this.school = new ArrayList<>();
        this.degree = new ArrayList<>();
    }

    public ArrayList<String> getDegree() {
        return degree;
    }

    public void setDegree(ArrayList<String> degree) {
        this.degree = degree;
    }

    public ArrayList<String> getSchool() {
        return school;
    }

    public void setSchool(ArrayList<String> school) {
        this.school = school;
    }

    public ArrayList<Integer> getDate() {
        return date;
    }

    public void setDate(ArrayList<Integer> date) {
        this.date = date;
    }
@Override
    public String toString(){
        String display ="";
        for(int i =0;i < school.size();i++){
            display += degree.get(i) + "\n"+ school.get(i)+","+date.get(i)+"\n\n";
        }
        return display;
    }

}
