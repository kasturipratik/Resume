package com.company;

import java.util.HashMap;

public class User {
 HashMap<String,String> user;

    public User() {
        this.user = new HashMap<String, String>();
    }

    public HashMap<String, String> getUser() {
        return user;
    }

    public void setUser(HashMap<String, String> user) {
        this.user = user;
    }

    @Override
    public String toString(){
        String display = "";
        for(String s: user.keySet()){
            display +=s +" \n"+ user.get(s)+"\n\n";
        }
        return  display;
    }
}
