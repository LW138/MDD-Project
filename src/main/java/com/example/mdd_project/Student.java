package com.example.mdd_project;

public class Student extends Person{
    private String matrikelnummer;

    public Student(String name, String vorname, String telnummer, String email, String matrikelnummer) {
        super(name, vorname, telnummer, email);
        this.matrikelnummer = matrikelnummer;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String toString(){
        return this.matrikelnummer + ": " + super.toString();
    }
}
