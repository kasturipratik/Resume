package com.company;

import java.util.ArrayList;

public class User {
    ArrayList<String> name;
    ArrayList<String> email;

    public User() {
        this.name = new ArrayList<>();
        this.email = new ArrayList<>();
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }

    @Override
    public String toString(){
        String display = "";
        for(int i=0; i< name.size();i++){
            display += name.get(i)+ "\n"+ email.get(i)+"\n\n";
        }
        return  display;
    }
}
