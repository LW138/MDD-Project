package com.example.mdd_project;

import java.util.ArrayList;
import java.util.List;

public class Modul {
    private double note;
    private boolean bestanden;
    private int versuche;
    private String name;
    private int crp;
    private List<Dozent> dozenten;
    private List<Dozent> veranwortliche;
    private List<Pruefung> pruefungen;
    private Studiengang studiengang;
    private Semester semester;

    public Modul(double note, boolean bestanden, int versuche, String name, int crp, List<Dozent> dozenten, List<Dozent> veranwortliche, List<Pruefung> pruefungen, Studiengang studiengang, Semester semester) {
        this.note = note;
        this.bestanden = bestanden;
        this.versuche = versuche;
        this.name = name;
        this.crp = crp;
        this.dozenten = dozenten;
        this.veranwortliche = veranwortliche;
        this.pruefungen = pruefungen;
        this.studiengang = studiengang;
        this.semester = semester;
    }

    public Modul(double note, boolean bestanden, int versuche, String name, int crp) {
        this.note = note;
        this.bestanden = bestanden;
        this.versuche = versuche;
        this.name = name;
        this.crp = crp;
        this.dozenten = new ArrayList<>();
        this.veranwortliche = new ArrayList<>();
        this.pruefungen = new ArrayList<>();
        this.studiengang = null;
        this.semester = null;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public boolean isBestanden() {
        return bestanden;
    }

    public void setBestanden(boolean bestanden) {
        this.bestanden = bestanden;
    }

    public int getVersuche() {
        return versuche;
    }

    public void setVersuche(int versuche) {
        this.versuche = versuche;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrp() {
        return crp;
    }

    public void setCrp(int crp) {
        this.crp = crp;
    }

    public List<Dozent> getDozenten() {
        return dozenten;
    }

    public void setDozenten(List<Dozent> dozenten) {
        this.dozenten = dozenten;
    }

    public List<Dozent> getVeranwortliche() {
        return veranwortliche;
    }

    public void setVeranwortliche(List<Dozent> veranwortliche) {
        this.veranwortliche = veranwortliche;
    }

    public List<Pruefung> getPruefungen() {
        return pruefungen;
    }

    public void setPruefungen(List<Pruefung> pruefungen) {
        this.pruefungen = pruefungen;
    }

    public Studiengang getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public void addDozent(Dozent dozent){
        this.dozenten.add(dozent);
    }

    public void addVeranwortliche(Dozent veranwortliche){
        this.veranwortliche.add(veranwortliche);
    }

    public String toString() {
        String back = "";

        if(this.studiengang != null){
            back += studiengang + " ";
        }

        back += this.semester + ": " + this.name + " bei ";

        for (Dozent d : this.dozenten) {
            back += d.getName() + ", ";
        }

        back += " Verantwortliche: ";

        for (Dozent d : this.veranwortliche) {
            back += d.getName() + ", ";
        }

        back += "; CRP: " + this.crp + ", Bestanden: " + this.bestanden + ", Versuche: " + this.versuche + ", Note: " + this.note + ": ";

        if(this.pruefungen.size() >= 1){
            for (Pruefung p : this.pruefungen) {
                back += p.toString() + ", ";
            }
        }

        return back;
    }
}
