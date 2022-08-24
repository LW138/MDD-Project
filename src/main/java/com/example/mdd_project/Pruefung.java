package com.example.mdd_project;

import java.util.Date;

public class Pruefung {
    private String datum;
    private double note;
    private boolean bestanden;
    private String art;
    private int gewichtung;

    public Pruefung(String datum, double note, boolean bestanden, String art, int gewichtung) {
        this.datum = datum;
        this.note = note;
        this.bestanden = bestanden;
        this.art = art;
        this.gewichtung = gewichtung;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
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

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getGewichtung() {
        return gewichtung;
    }

    public void setGewichtung(int gewichtung) {
        this.gewichtung = gewichtung;
    }

    public String toString(){
        String back = this.art + " (" + this.datum + ")" + ": bestanden:" + this.bestanden + ": " + this.note + "; Gewichtung: " + this.gewichtung;

        return back;
    }
}
