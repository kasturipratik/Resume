package com.company;

public class Person {
    Education education;
    WorkExperience jobs;
    Skills skill;
    private  String name ;
    private String email;

    public Person() {
        this.education = new Education();
        this.jobs = new WorkExperience();
        this.skill = new Skills();
        this.name = name;
        this.email = email;

    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public WorkExperience getJobs() {
        return jobs;
    }

    public void setJobs(WorkExperience jobs) {
        this.jobs = jobs;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString(){
        String display =name + "\n"+ email;
        return display;

    }


}
