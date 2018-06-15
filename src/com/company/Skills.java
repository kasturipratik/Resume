package com.company;

import java.util.HashMap;

public class Skills {
  HashMap<String,String> skills ;

    public Skills() {
        skills = new HashMap<>();
    }

    public HashMap<String, String> getSkills() {
        return skills;
    }

    public void setSkills(HashMap<String, String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString(){
        String display ="";
        for(String s : skills.keySet()){
            display +=s +", "+ skills.get(s) +"\n";
        }
        return display;
    }

}
