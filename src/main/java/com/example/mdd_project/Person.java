package com.example.mdd_project;

public class Person {
    private String name;
    private String vorname;
    private String telnummer;
    private String email;


    public Person(String name, String vorname, String telnummer, String email) {
        this.name = name;
        this.vorname = vorname;
        this.telnummer = telnummer;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getTelnummer() {
        return telnummer;
    }

    public void setTelnummer(String telnummer) {
        this.telnummer = telnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        String back = this.name + ", " + this.vorname + ": " + this.email;
        if(telnummer != ""){
            back += "; " + this.telnummer;
        }
        return back;
    }
}
