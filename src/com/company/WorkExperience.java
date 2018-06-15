package com.company;

import java.util.ArrayList;

public class WorkExperience {
    ArrayList<String>  title ;
    ArrayList<String> location;
    ArrayList<String> date;
    ArrayList<String> duty1;
    ArrayList<String> duty2;

    public WorkExperience() {
        this.date= new ArrayList<>();
        this.duty1 = new ArrayList<>();
        this.duty2 = new ArrayList<>();
        this.location = new ArrayList<>();
        this.title = new ArrayList<>();
    }

    public ArrayList<String> gettitle() {
        return title;
    }

    public void settitle(ArrayList<String> title) {
        this.title = title;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getDate() {
        return date;
    }

    public void setDate(ArrayList<String> date) {
        this.date = date;
    }

    public ArrayList<String> getDuty1() {
        return duty1;
    }

    public void setDuty1(ArrayList<String> duty1) {
        this.duty1 = duty1;
    }

    public ArrayList<String> getDuty2() {
        return duty2;
    }

    public void setDuty2(ArrayList<String> duty2) {
        this.duty2 = duty2;
    }
    
    @Override
    public String toString()
    {   
        String display = "";
        for(int i =0;i < title.size();i++){
            display += title.get(i)+"\n"+location.get(i)+", "+date.get(i)+"\n"+ "-Duty 1, "+duty1.get(i)+"\n- Duty2, "+ duty2.get(i) +"\n\n";
        }
     return display;
    }
}
