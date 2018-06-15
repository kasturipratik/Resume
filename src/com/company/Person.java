package com.company;

public class Person {
    Education education;
    WorkExperience jobs;
    Skills skill;

    public Person() {
        this.education = new Education();
        this.jobs = new WorkExperience();
        this.skill = new Skills();
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
}
