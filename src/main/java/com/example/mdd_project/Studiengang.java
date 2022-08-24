package com.example.mdd_project;

import java.util.ArrayList;
import java.util.List;

public class Studiengang {
    private String name;
    private int regelstudienzeit;
    private Dozent verantwortlicher;
    private String fachbereich;
    private String typ;
    private List<Modul> module;


    public Studiengang(String name, int regelstudienzeit, Dozent verantwortlicher, String fachbereich, String typ, List<Modul> module) {
        this.name = name;
        this.regelstudienzeit = regelstudienzeit;
        this.verantwortlicher = verantwortlicher;
        this.fachbereich = fachbereich;
        this.typ = typ;
        this.module = module;
    }

    public Studiengang(String name, int regelstudienzeit, String fachbereich, String typ) {
        this.name = name;
        this.regelstudienzeit = regelstudienzeit;
        this.verantwortlicher = null;
        this.fachbereich = fachbereich;
        this.typ = typ;
        this.module = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegelstudienzeit() {
        return regelstudienzeit;
    }

    public void setRegelstudienzeit(int regelstudienzeit) {
        this.regelstudienzeit = regelstudienzeit;
    }

    public Dozent getVerantwortlicher() {
        return verantwortlicher;
    }

    public void setVerantwortlicher(Dozent verantwortlicher) {
        this.verantwortlicher = verantwortlicher;
    }

    public String getFachbereich() {
        return fachbereich;
    }

    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public List<Modul> getModule() {
        return module;
    }

    public void setModule(List<Modul> module) {
        this.module = module;
    }

    public void addModul(Modul modul){
        this.module.add(modul);
    }

    public String toString(){
        String back = this.name + ": Fachbereich: " + this.fachbereich + "; Typ: " + this.typ + "; Verantworlicher: " + this.verantwortlicher.getName() + "; Regelstudienzeit: " + this.regelstudienzeit + "; Module: ";

        if(this.module.size() >= 1){
            for (Modul m : this.module) {
                back += m.getName() + ", ";
            }
        }

        return back;
    }
}
