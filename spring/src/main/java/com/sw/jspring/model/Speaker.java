package com.sw.jspring.model;

public class Speaker {

    public String firstname;
    public String lastname;
    public double seednumber;

    public double getSeednumber() {
        return seednumber;
    }

    public void setSeednumber(double seednumber) {
        this.seednumber = seednumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
