package com.example.mdd_project;

import java.util.List;

public class Studiengangsliste {
    private List<Studiengang> studiengaenge;

    public Studiengangsliste(List<Studiengang> studiengaenge) {
        this.studiengaenge = studiengaenge;
    }

    public List<Studiengang> getStudiengaenge() {
        return studiengaenge;
    }

    public void setStudiengaenge(List<Studiengang> studiengaenge) {
        this.studiengaenge = studiengaenge;
    }

    public String toString(){
        String back = "Studiengaenge: \n";

        for (Studiengang s : this.studiengaenge) {
            back += s.toString() + "\n";
        }

        return back + "\n";
    }
}
