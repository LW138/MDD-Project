package com.example.mdd_project;

import java.util.List;

public class Dozentenliste {
    private List<Dozent> dozenten;

    public Dozentenliste(List<Dozent> dozenten) {
        this.dozenten = dozenten;
    }

    public List<Dozent> getDozenten() {
        return dozenten;
    }

    public void setDozenten(List<Dozent> dozenten) {
        this.dozenten = dozenten;
    }

    public String toString(){
        String back = "Dozenten: \n";

        for (Dozent d : this.dozenten) {
            back += d.toString() + "\n";
        }

        return back + "\n";
    }
}
